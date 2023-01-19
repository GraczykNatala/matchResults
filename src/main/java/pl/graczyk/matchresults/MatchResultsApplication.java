package pl.graczyk.matchresults;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static java.util.Arrays.sort;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class MatchResultsApplication {

    public static void main(String[] args) throws IOException {

        DataService ds = new DataService();
        List<Event> events = ds.eventList();
        events.stream().forEach(e -> e.setHighest_probable_result(Event.HighestProbableResult(e.getProbability_home_team_winner(),
                e.getProbability_draw(),e.getProbability_away_team_winner())));
        System.out.println("SORTOWANIE");

        int amountOfResults = 10;

      Collections.sort(events);
        showList(amountOfResults, events);


        }

    private static void showList(int amountOfResults, List<Event> events) {
        for (int i = 0; i< 10; i++){
            System.out.println(events.get(i));
        }
    }



}
