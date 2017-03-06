package unipos.feedback.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import unipos.feedback.components.company.Company;
import unipos.feedback.components.company.CompanyRepository;
import unipos.feedback.components.rating.Rating;

import java.util.ArrayList;

/**
 * Created by Gregor on 05.03.2017.
 */

@Component
public class Initializer {

    @Autowired
    private CompanyRepository companyRepository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initDatabase();
    }

    private void initDatabase() {

        companyRepository.deleteAll();


        Company company1 = Company.builder().name("Schnipp Schnapp").build();

        Rating rating1 = new Rating();
        rating1.setInvoiceId("a");
        rating1.setPointsAwarded(5);

        Rating rating2 = new Rating();
        rating2.setInvoiceId("b");
        rating2.setPointsAwarded(1);

        company1.setRatings(new ArrayList<>());
        company1.getRatings().add(rating1);
        company1.getRatings().add(rating2);

        company1.setBranche("gewerbe");
        company1.setSubbranche("friseur");


        Company company2 = Company.builder().name("Buddha Shop").build();

        Rating rating3 = new Rating();
        rating3.setInvoiceId("c");
        rating3.setPointsAwarded(3);

        Rating rating4 = new Rating();
        rating4.setInvoiceId("d");
        rating4.setPointsAwarded(1);

        company2.setRatings(new ArrayList<>());
        company2.getRatings().add(rating3);
        company2.getRatings().add(rating4);

        company2.setBranche("handel");
        company2.setSubbranche("esoterik");


        Company company3 = Company.builder().name("Schnenk dir was").build();

        Rating rating5 = new Rating();
        rating5.setInvoiceId("e");
        rating5.setPointsAwarded(4);

        Rating rating6 = new Rating();
        rating6.setInvoiceId("f");
        rating6.setPointsAwarded(5);

        company3.setRatings(new ArrayList<>());
        company3.getRatings().add(rating5);
        company3.getRatings().add(rating6);

        company3.setBranche("handel");
        company3.setSubbranche("geschenke");


        Company company4 = Company.builder().name("Its over 9000V").build();

        Rating rating7 = new Rating();
        rating7.setInvoiceId("g");
        rating7.setPointsAwarded(5);

        Rating rating8 = new Rating();
        rating8.setInvoiceId("h");
        rating8.setPointsAwarded(1);

        company4.setRatings(new ArrayList<>());
        company4.getRatings().add(rating7);
        company4.getRatings().add(rating8);

        company4.setBranche("gewerbe");
        company4.setSubbranche("elektriker");



        companyRepository.save(company1);
        companyRepository.save(company2);
        companyRepository.save(company3);
        companyRepository.save(company4);
    }

}
