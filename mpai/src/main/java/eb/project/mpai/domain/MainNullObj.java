package eb.project.mpai.domain;

import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.service.interfaces.RezervareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class MainNullObj {

    public static void main(String[] args) {

        List<Rezervare> rezervari = new ArrayList<>();
        Rezervare rezervare = new Rezervare();
        rezervare.setId(1L);
        rezervare.setLoc(100);
        Utilizator utilizator = new Utilizator("Dana", "dana@gmail.com");
        BiletNormalCinema biletNormalCinema = new BiletNormalCinema();
        biletNormalCinema.setCapacitate(200);
        biletNormalCinema.setData("01/02/2020");
        biletNormalCinema.setId(1L);
        biletNormalCinema.setNumeEveniment("Mulan");
        biletNormalCinema.setLocatie("Cinema City Targu-Jiu");
        rezervare.setBnCinema(biletNormalCinema);
        rezervari.add(rezervare);

        AbstractHistory h1 = HistoryFactory.getHistory(rezervari);
        AbstractHistory h2 = HistoryFactory.getHistory(null);

        System.out.println("Istoric");
        System.out.println(h1.getContinut());
        System.out.println("#################");
        System.out.println(h2.getContinut());


    }
}
