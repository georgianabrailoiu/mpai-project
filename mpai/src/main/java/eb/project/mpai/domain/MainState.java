package eb.project.mpai.domain;

import eb.project.mpai.domain.interfaces.State;

public class MainState {
    public static void main(String[] args) {
        State activ = new ActiveState();
        State inactiv = new InactiveState();
        Utilizator utilizator = new Utilizator();
        utilizator.setId(1L);
        utilizator.setNume("Ana");
        utilizator.setEmail("ana@gmail.com");
        utilizator.setParola("parola");
        utilizator.setAdresa("Str. Primaverii");

        utilizator.setStare(activ);
        utilizator.doAction(utilizator);

        utilizator.setStare(inactiv);
        utilizator.doAction(utilizator);


    }
}
