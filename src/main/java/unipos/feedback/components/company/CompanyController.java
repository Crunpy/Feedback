package unipos.feedback.components.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import unipos.feedback.components.company.commands.CompanyCommand;
import unipos.feedback.components.company.commands.SearchCommand;

import java.util.List;

/**
 * Created by dominik on 09.09.15.
 */

@Controller
@RequestMapping(value = "/companies")
public class CompanyController {

    @Autowired
    private CompanyRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String companyIndex() {
        // which template
       return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String companySearchAll(Model model) {

        // query repository
        List<Company> companies = repository.findAll();

        for(Company c: companies)
        {
            c.setAvgRating();
        }

        // thymeleaf inject variables
        model.addAttribute("companies", companies);

        return "searchResult";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String companySearch(SearchCommand search, Model model) {

        List<Company> companies = null;


        search.setSubbranche();
        System.out.println(search);

        if(search.getSubbranche().equalsIgnoreCase("none")) {
            companies = repository.findByBranche(search.getBranche());
        }

        else
        {
            companies = repository.findByBrancheAndSubbranche(search.getBranche(), search.getSubbranche());
        }

        for(Company c: companies)
        {
            c.setAvgRating();
        }


        model.addAttribute("companies", companies);

        return "SearchResult";
    }

    @RequestMapping(value = "/details", method = RequestMethod.POST)
    public String companyDetails(CompanyCommand company, Model model){

        List<Company> companies = repository.findByName(company.getName());

        for(Company c: companies)
        {
            c.setAvgRating();
        }

        model.addAttribute("companies", companies);

        return "Details";

    }

}
