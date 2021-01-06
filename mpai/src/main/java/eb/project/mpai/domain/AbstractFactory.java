package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Eveniment;

import java.util.Date;

public abstract class AbstractFactory {
    abstract Eveniment getItem(Tip collection, String numeEveniment, String data, int capacitate, String locatie);
}
