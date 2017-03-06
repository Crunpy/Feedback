package unipos.feedback.components.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unipos.feedback.components.rating.RatingRepository;

import java.util.List;

/**
 * Created by dominik on 09.09.15.
 */

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    RatingRepository ratingRepository;

    @Override
    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }
}
