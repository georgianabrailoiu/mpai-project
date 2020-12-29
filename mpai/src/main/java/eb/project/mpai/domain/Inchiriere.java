package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Colectie;

public class Inchiriere extends AbstractFactory {
    @Override
    Colectie getItem(Tip collection) {
        if(collection.equals(Tip.Camera))
            return new CameraInchiriere();
        else if(collection.equals(Tip.Locuinta))
            return new LocuintaInchiriere();

        System.out.println("Not exist!");
        return null;
    }
}
