package unipos.feedback.components.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Roy on 12.12.2016.
 */
@RestController
@RequestMapping(value="/ratings")

public class RatingController {
    @Autowired
    RatingService ratingService;

    @RequestMapping(value="")
    List<Rating> findByCompany(@RequestParam String companyId){
        return ratingService.findByCompany(companyId);
    }
}
