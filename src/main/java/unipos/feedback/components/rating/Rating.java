package unipos.feedback.components.rating;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by domin on 03.12.2016.
 */
@Document(collection = "ratings")
@Data
public class Rating {

    @Id
    private String id;
    private String invoiceId;
    private int pointsAwarded;
}
