package eb.project.mpai.domain;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Eveniment;

import java.util.Date;

public class BiletNormal extends AbstractFactory {

    private Eveniment eveniment;

    @Override
    public Eveniment getItem(Tip collection) {
        if(collection.equals(Tip.Teatru))
            return new BiletNormalTeatru();
        else if(collection.equals(Tip.Cinema))
            return new BiletNormalCinema();
        else if(collection.equals(Tip.Concert))
            return new BiletNormalConcert();

        System.out.println("Not exist!");
        return null;
    }

    public Eveniment getEveniment() {
        return eveniment;
    }

    public void setEveniment(Eveniment eveniment) {
        this.eveniment = eveniment;
    }

}