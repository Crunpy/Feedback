package unipos.feedback.components.company;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import unipos.feedback.components.rating.Rating;

import java.util.List;

@Document(collection = "companies")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    protected String id;
    protected String name;
    protected String branche;
    protected String subbranche;
    protected List<Rating> ratings;
    protected  int avgRating;

    public void setAvgRating()
    {
        int sum = 0;
        int count = 0;

        for(Rating r: ratings)
        {
            sum = sum + r.getPointsAwarded();
            count++;
        }
        avgRating = sum/count;
    }


}
