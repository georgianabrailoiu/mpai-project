package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Eveniment;

import java.util.Date;

public abstract class AbstractFactory {
    public abstract Eveniment getItem(Tip collection);
}
