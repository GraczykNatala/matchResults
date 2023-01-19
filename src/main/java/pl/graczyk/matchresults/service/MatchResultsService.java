package pl.graczyk.matchresults.service;

import pl.graczyk.matchresults.POJO.Event;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class MatchResultsService {

    private final DataService dataService = new DataService();

    public MatchResultsService() {
    }
    public void ListOfMatchResults(int amountOfResults) throws FileNotFoundException {
        List<Event> events = dataService.eventList();
        events.stream().forEach(e -> e.setHighest_probable_result(Event.HighestProbableResult(
                e.getProbability_home_team_winner(),
                e.getProbability_draw(),
                e.getProbability_away_team_winner())));

        Collections.sort(events);
        try {
            showList(amountOfResults, events);
        } catch (IndexOutOfBoundsException e)
        {
            amountOfResults = events.size();
        }

    }



    private void showList(int amountOfResults, List<Event> events) {
        for (int i = 0; i< amountOfResults; i++){
            System.out.println(events.get(i));
        }
    }
}
