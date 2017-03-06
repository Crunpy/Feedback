package unipos.feedback.components.company.commands;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Gregor on 05.03.2017.
 */

@Data
public class SearchCommand {

    private String branche;

    private String subbranche;

    private String subGewerbe;
    private String subHandel;
    private String subTourismus;
    private String subArzt;
    private String subBeauty;


    public void setSubbranche()
    {
        String filter = "sub" + getBranche();

        if(filter.equalsIgnoreCase("subGewerbe"))
        {
            this.subbranche = getSubGewerbe();
        }

        else if(filter.equalsIgnoreCase("subHandel"))
        {
            this.subbranche = getSubHandel();
        }

        else if(filter.equalsIgnoreCase("subTourismus"))
        {
            this.subbranche = getSubTourismus();
        }

         else if(filter.equalsIgnoreCase("subArzt"))
        {
            this.subbranche = getSubArzt();
        }

         else if(filter.equalsIgnoreCase("subBeauty"))
        {
            this.subbranche = getSubBeauty();
        }

        else
        {
            this.subbranche = null;
        }
    }
}
