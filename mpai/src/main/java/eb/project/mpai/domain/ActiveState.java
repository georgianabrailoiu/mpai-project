package eb.project.mpai.domain;

import eb.project.mpai.domain.interfaces.State;

public class ActiveState implements State {

    @Override
    public void doAction(Utilizator utilizator) {
        System.out.println("Contul a fost activat cu succes");
        utilizator.setActive(true);
    }
}
