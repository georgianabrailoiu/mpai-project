package eb.project.mpai.domain;

import java.util.List;
import java.util.Set;

public abstract class AbstractHistory {
    protected List<Rezervare> rezervari;

    public abstract boolean isNil();

    public abstract List<Rezervare> getContinut();

}
