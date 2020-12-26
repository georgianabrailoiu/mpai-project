package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Colectie;

public class Cumparare extends AbstractFactory {
        @Override
        Colectie getItem(Tip collection) {
            if(collection.equals(Tip.Locuinta))
                return new LocuintaVanzare();

            System.out.println("Not exist!");
            return null;
        }


}
