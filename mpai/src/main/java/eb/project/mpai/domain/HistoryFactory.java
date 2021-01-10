package eb.project.mpai.domain;

import java.util.List;

public class HistoryFactory {

    public static AbstractHistory getHistory(List<Rezervare> rezervari) {

        if (rezervari != null && rezervari.size() > 0) {
            return new History(rezervari);
        }
        return new NullHistory();
    }
}
