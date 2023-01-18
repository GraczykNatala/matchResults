package pl.graczyk.matchresults;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class MatchResultsApplication {

    public static void main(String[] args) throws IOException {



      List<Event> events = eventList();
      //  Collections.sort(events);
      Object[] eventarr = events.toArray();
        Arrays.sort(eventarr);
        for (int i = 0; i< eventarr.length; i++){
            System.out.println(eventarr[i]);
        }



        }





    private static List<Event> eventList() throws FileNotFoundException {

        JsonParser parser = new JsonParser();
        Object obj =parser.parse(new FileReader(
                "C:\\Users\\Natala\\IdeaProjects\\matchResults\\src\\main\\resources\\data\\BE_data.json")) ;
        JsonObject jsonObject = (JsonObject) obj;
        JsonArray eventData = (JsonArray) jsonObject.get("Events");
        List<Event> eventList = new Gson().fromJson(eventData, new TypeToken<List<Event>>(){}.getType());
        return eventList;
    }


}
