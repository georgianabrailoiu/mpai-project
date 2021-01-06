package eb.project.mpai.domain;

import eb.project.mpai.domain.bilete.*;
import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Eveniment;

import java.util.Date;

public class BiletVIP extends AbstractFactory {

    private Eveniment eveniment;
    private float pret;
    private int nrLoc;

    @Override
    Eveniment getItem(Tip collection) {
        if(collection.equals(Tip.Teatru))
            return new BiletVIPTeatru();
        else if(collection.equals(Tip.Cinema))
            return new BiletVIPCinema();
        else if(collection.equals(Tip.Concert))
            return new BiletVIPConcert();

        System.out.println("Not exist!");
        return null;
    }

    public BiletVIP(float pret, int nrLoc) {
        this.pret = pret;
        this.nrLoc = nrLoc;

    }
}
