package pl.graczyk.matchresults;
import pl.graczyk.matchresults.service.CompetitorService;
import pl.graczyk.matchresults.service.MatchResultsService;
import java.io.IOException;
import java.util.Scanner;


public class MatchResultsApplication {

    public static void main(String[] args) throws IOException {



        Scanner scanner = new Scanner(System.in);

        int amountOfResults = scanner.nextInt();

        MatchResultsService matchResutsService = new MatchResultsService();
        matchResutsService.ListOfMatchResults(amountOfResults);



        CompetitorService competitorService = new CompetitorService();
        competitorService.ListOfCompetitors();

        }

}
