package pl.graczyk.matchresults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.graczyk.matchresults.service.CompetitorService;
import pl.graczyk.matchresults.service.MatchResultsService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class MatchResultsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatchResultsApplication.class, args);} {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What you want to do?");
        System.out.println("List of competitors - 1");
        System.out.println("List of most probable Match results - 2");
        int usersChoice = scanner.nextInt();


        if (usersChoice == 1){
            CompetitorService competitorService = new CompetitorService();
            try {
                competitorService.ListOfCompetitors();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else if (usersChoice == 2){
            System.out.println("Enter the amount of results");
                int amountOfResults = scanner.nextInt();

                MatchResultsService matchResultsService = new MatchResultsService();
            try {
                matchResultsService.ListOfMatchResults(amountOfResults);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }

       }
}
