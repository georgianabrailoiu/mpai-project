package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.interfaces.Colectie;

public class Main {

    public static void main(String[] args) {
        AbstractFactory colectie1 = TipTranzactieFactory.inchiriaza(true);
        Colectie item1 = colectie1.getItem(Tip.Camera);
        item1.render();
        item1 = colectie1.getItem(Tip.Locuinta);
        item1.render();

        AbstractFactory colectie2 = TipTranzactieFactory.inchiriaza(false);
        item1 = colectie2.getItem(Tip.Locuinta);
        item1.render();
    }
}
