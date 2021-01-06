package eb.project.mpai.domain;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Eveniment;

import java.util.Date;

public class BiletNormal extends AbstractFactory {

    private Eveniment eveniment;
    private float pret;
    private int nrLoc;

    @Override
    Eveniment getItem(Tip collection, String numeEveniment, String data, int capacitate, String locatie) {
        if(collection.equals(Tip.Teatru))
            return new BiletNormalTeatru(numeEveniment, data, capacitate, locatie);
        else if(collection.equals(Tip.Cinema))
            return new BiletNormalCinema(numeEveniment, data, capacitate, locatie);
        else if(collection.equals(Tip.Concert))
            return new BiletNormalConcert(numeEveniment, data, capacitate, locatie);

        System.out.println("Not exist!");
        return null;
    }

    public BiletNormal(float pret, int nrLoc) {
        this.pret = pret;
        this.nrLoc = nrLoc;
    }
}