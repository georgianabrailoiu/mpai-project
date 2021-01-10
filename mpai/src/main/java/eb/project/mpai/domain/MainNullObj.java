package eb.project.mpai.domain;

import java.util.ArrayList;
import java.util.List;

public class MainNullObj {

    public static void main(String[] args) {


        // select * from
        List<String> rezervari=new ArrayList<>();
        rezervari.add("CINEMA 8 ");
        rezervari.add("CINEMA88");
        rezervari.add("CINEMA44");
        rezervari.add("CINEMA2");

        AbstractHistory h1 = HistoryFactory.getHistory(rezervari);
        AbstractHistory h2 = HistoryFactory.getHistory(new ArrayList<>());


        System.out.println("IStoric");
        System.out.println(h1.getContinut());
        System.out.println(h2.getContinut());



    }
}
