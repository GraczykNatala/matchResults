package pl.graczyk.matchresults;
import pl.graczyk.matchresults.service.CompetitorService;
import pl.graczyk.matchresults.service.MatchResultsService;
import java.io.IOException;
import java.util.Scanner;


public class MatchResultsApplication {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What you want to do?");
        System.out.println("List of competitors - 1");
        System.out.println("List of most probable Match results - 2");
        int usersChoice = scanner.nextInt();


        if (usersChoice == 1){
            CompetitorService competitorService = new CompetitorService();
            competitorService.ListOfCompetitors();
        } else if (usersChoice == 2){
            System.out.println("Enter the amount of results");
                int amountOfResults = scanner.nextInt();

                MatchResultsService matchResutsService = new MatchResultsService();
                matchResutsService.ListOfMatchResults(amountOfResults);

            }

        }

}
