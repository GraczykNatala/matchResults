package pl.graczyk.matchresults;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class MatchResultsApplication {

    public static void main(String[] args) throws IOException {
      //  SpringApplication.run(MatchResultsApplication.class, args);
eventList();





        for(int i = 0; i < 10; i++){
            System.out.println(eventList().get(i));
        }
    }

    private static JsonArray eventList() throws FileNotFoundException {

        Gson gson = new Gson();

        JsonParser parser = new JsonParser();
        Object obj =parser.parse(new FileReader(
                "C:\\Users\\Natala\\IdeaProjects\\matchResults\\src\\main\\resources\\data\\BE_data.json")) ;
        JsonObject jsonObject = (JsonObject) obj;
        JsonArray events = (JsonArray) jsonObject.get("Events");

        return events;
    }


}
