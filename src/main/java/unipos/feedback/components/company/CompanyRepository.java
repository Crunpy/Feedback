package unipos.feedback.components.company;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dominik on 09.09.15.
 */

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {

    List<Company> findByBrancheAndSubbranche(String branche, String subbranche);
    List<Company> findByBranche(String branche);
    List<Company> findBySubbranche(String subbranche);
    List<Company> findByName(String name);
}
