package eb.project.mpai.domain;

import java.util.ArrayList;
import java.util.List;

public class NullHistory extends AbstractHistory {



    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public List<String> getContinut() {

        return new ArrayList<>();
    }
}
