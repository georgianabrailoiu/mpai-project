package eb.project.mpai.domain;

import java.util.List;

public  abstract  class AbstractHistory {
    protected List<String> continut; /// in loc de continut pune Rezervari
    public abstract boolean isNil();
    public abstract List<String> getContinut();

}
