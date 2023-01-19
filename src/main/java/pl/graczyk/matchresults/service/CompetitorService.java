package pl.graczyk.matchresults.service;

import pl.graczyk.matchresults.POJO.Event;

import java.io.FileNotFoundException;
import java.util.*;

public class CompetitorService {
    private final DataService dataService = new DataService();
    public CompetitorService() {
    }

    public Set ListOfCompetitors() throws FileNotFoundException {
        List<Event> events = dataService.eventList();

        Set<String> competitors = new TreeSet<>();
        for (Event value : events) {
            for (int team = 0; team <= 1; team++) {
                competitors.add(value.
                        getCompetitors()[team]
                        .getName());
            }
        }
       // showCompetitors(competitors);
    return competitors;
    }
    private void showCompetitors(Set competitors) {
    for(Object team : competitors) {
        System.out.println(team);
     }
    }
}
