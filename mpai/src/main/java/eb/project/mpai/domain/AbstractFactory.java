package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Colectie;

public abstract class AbstractFactory {
    abstract Colectie getItem(Tip collection);
}
