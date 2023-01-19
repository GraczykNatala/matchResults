package pl.graczyk.matchresults;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.graczyk.matchresults.service.CompetitorService;

import java.io.FileNotFoundException;
import java.util.Set;

@RestController
public class CompetitorController {

    CompetitorService competitorService = new CompetitorService();
    @GetMapping("/competitors")
    public Set competitors() throws FileNotFoundException {
        Set competitors = competitorService.ListOfCompetitors();
        return competitors;
    }
}
