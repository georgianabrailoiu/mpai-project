package eb.project.mpai.domain;

public class MainState {
    public static void main(String[] args) {
        Utilizator utilizator=new Utilizator();
        ActiveState activ=new ActiveState();
        InactiveState inactiv=new InactiveState();

        utilizator.setStare(activ);
        utilizator.doAction();

        utilizator.setStare(inactiv);
        utilizator.doAction();



    }
}
