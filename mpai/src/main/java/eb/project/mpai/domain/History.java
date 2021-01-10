package eb.project.mpai.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class History extends AbstractHistory {

    public History(List<Rezervare> rezervari) {
        this.rezervari = rezervari;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public List<Rezervare> getContinut() {
        return rezervari;

    }

}
