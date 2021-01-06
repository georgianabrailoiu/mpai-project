package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.enums.TipBilet;
import eb.project.mpai.domain.interfaces.Eveniment;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        AbstractFactory colectie1 = TipBiletFactory.rezerva(TipBilet.NORMAL, 10.5f, 30);
        Eveniment item1 = colectie1.getItem(Tip.Cinema, "Motans", "01.02.2021", 200, "Arenele Romane");
        item1.render();
        item1 = colectie1.getItem(Tip.Teatru, "Alba ca zapada", "11.04.2020", 400, "TNB");
        item1.render();
        item1 = colectie1.getItem(Tip.Cinema, "Mulan", "07.01.2021", 350, "Park Lake");
        item1.render();

        AbstractFactory colectie2 = TipBiletFactory.rezerva(TipBilet.VIP, 14.5f, 10);
        item1 = colectie2.getItem(Tip.Cinema, "Motans", "01.02.2021", 200, "Arenele Romane");
        item1.render();
        item1 = colectie2.getItem(Tip.Teatru, "Alba ca zapada", "11.04.2020", 400, "TNB");
        item1.render();
        item1 = colectie2.getItem(Tip.Cinema, "Mulan", "07.01.2021", 350, "Park Lake");
        item1.render();
    }
}
