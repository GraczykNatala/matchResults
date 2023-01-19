package pl.graczyk.matchresults.service;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import pl.graczyk.matchresults.POJO.Event;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class DataService {

    public  List<Event> eventList() throws FileNotFoundException {

        JsonParser parser = new JsonParser();
        Object obj =parser.parse(new FileReader(
                "C:\\Users\\Natala\\IdeaProjects\\matchResults\\src\\main\\resources\\data\\BE_data.json")) ;
        JsonObject jsonObject = (JsonObject) obj;
        JsonArray eventData = (JsonArray) jsonObject.get("Events");
        return new Gson().fromJson(eventData, new TypeToken<List<Event>>(){}.getType());
    }
}
