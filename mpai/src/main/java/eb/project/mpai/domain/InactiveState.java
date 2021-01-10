package eb.project.mpai.domain;

import eb.project.mpai.domain.interfaces.State;

public class InactiveState implements State {

    @Override
    public void doAction(Utilizator utilizator) {
        System.out.println("Contul a fost dezactivat");
        utilizator.setActive(false);
    }
}
