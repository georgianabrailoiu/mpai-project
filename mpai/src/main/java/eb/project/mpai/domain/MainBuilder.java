package eb.project.mpai.domain;

public class MainBuilder {

    public static void main(String[] args) {
        Utilizator utilizator = new Utilizator.BuilderUtilizator("Anca", "anca.bute@mail.com", "123456", "0726123456")
                .setAdresa("Str. Fericirii")
                .setCodPostal("1234456")
                .setStareCivila("necasatorit")
                .setVarsta(23)
                .build();

        Utilizator utilizator1 = new Utilizator.BuilderUtilizator("Ioana", "ioana@mail.com", "123456", "0726123456")
                .setAdresa("Str. Fericirii")
                .setVarsta(23)
                .build();

        System.out.println(utilizator);
        System.out.println(utilizator1);
    }
}
