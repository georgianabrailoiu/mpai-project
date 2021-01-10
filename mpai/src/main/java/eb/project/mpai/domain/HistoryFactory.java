package eb.project.mpai.domain;

import java.util.ArrayList;
import java.util.List;

public class HistoryFactory {



    public static AbstractHistory getHistory(List<String> rezervari){


            if (rezervari.size()>0){
                return new History(rezervari);

        }
        return new NullHistory();
    }
}
