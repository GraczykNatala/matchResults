package pl.graczyk.matchresults.service;

import pl.graczyk.matchresults.POJO.Event;

import java.io.FileNotFoundException;
import java.util.*;

public class CompetitorService {
    private final DataService dataService = new DataService();
    public CompetitorService() {
    }

    public void ListOfCompetitors() throws FileNotFoundException {
        List<Event> events = dataService.eventList();

        Set<String> competitors = new TreeSet<>();
        for(int event = 0; event <events.size(); event++) {
            for(int team = 0; team<=1; team++){
                competitors.add(events.get(event).
                        getCompetitors()[team]
                        .getName());
        }
        }
        showCompetitors(competitors);
    }
    private void showCompetitors(Set competitors) {
    for(Object team : competitors) {
        System.out.println(team);
     }
    }
}
