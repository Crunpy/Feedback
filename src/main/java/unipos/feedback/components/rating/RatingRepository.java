package unipos.feedback.components.rating;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by domin on 03.12.2016.
 */
public interface RatingRepository extends MongoRepository<Rating, String> {
    public List<Rating> findByInvoiceId(String invoiceId);
}
