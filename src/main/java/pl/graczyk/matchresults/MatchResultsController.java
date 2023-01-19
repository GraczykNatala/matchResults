package pl.graczyk.matchresults;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.graczyk.matchresults.service.MatchResultsService;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

@RestController
public class MatchResultsController {

    MatchResultsService matchResultsService = new MatchResultsService();

    @JsonIgnore
    @GetMapping("/matchresults/{amount}")
    public List matchResults(@PathVariable int amount) throws FileNotFoundException {
        List matchResults = matchResultsService.ListOfMatchResults(amount).stream().limit(amount).toList();
        return matchResults;
    }

}