package pl.graczyk.matchresults;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchResultsApplication {

    public static void main(String[] args) {
      //  SpringApplication.run(MatchResultsApplication.class, args);
        System.out.println("hello world");
        Gson gson = new Gson();
    }

}
