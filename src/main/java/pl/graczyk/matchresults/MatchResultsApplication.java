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
import java.util.List;

@SpringBootApplication
public class MatchResultsApplication {

    public static void main(String[] args) throws IOException {
      //  SpringApplication.run(MatchResultsApplication.class, args);


        for(int i = 0; i < events().size(); i++) {
            System.out.println(events().get(i).toString());
        }


    }


    private static List<Event> events() throws FileNotFoundException {

        JsonParser parser = new JsonParser();
        Object obj =parser.parse(new FileReader(
                "C:\\Users\\Natala\\IdeaProjects\\matchResults\\src\\main\\resources\\data\\BE_data.json")) ;
        JsonObject jsonObject = (JsonObject) obj;
        JsonArray eventList = (JsonArray) jsonObject.get("Events");
        List<Event> events = new Gson().fromJson(eventList, new TypeToken<List<Event>>(){}.getType());
        return events;
    }


}
