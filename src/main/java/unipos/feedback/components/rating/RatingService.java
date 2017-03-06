package unipos.feedback.components.rating;

import java.util.List;

/**
 * Created by Roy on 12.12.2016.
 */


public interface RatingService {
    List<Rating> findByCompany(String companyId);

    List<Rating> findByInvoiceID(String invoiceId);
}
