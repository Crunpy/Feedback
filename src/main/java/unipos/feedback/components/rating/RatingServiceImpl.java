package unipos.feedback.components.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unipos.feedback.components.company.Company;
import unipos.feedback.components.company.CompanyRepository;

import java.util.List;

/**
 * Created by Roy on 12.12.2016.
 */
@Service
public class RatingServiceImpl implements RatingService  {
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Rating> findByCompany(String companyId) {
        Company company = companyRepository.findOne(companyId);

        return company.getRatings();
    }

    @Override
    public List<Rating> findByInvoiceID(String invoiceId) {
        return ratingRepository.findByInvoiceId(invoiceId);

    }
}
