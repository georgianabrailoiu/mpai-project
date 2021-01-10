package eb.project.mpai.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NullHistory extends AbstractHistory {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public List<Rezervare> getContinut() {
        System.out.println("Lista de rezervari este goala");
        return new ArrayList<>();
    }
}
