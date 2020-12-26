package eb.project.mpai.domain;

import eb.project.mpai.domain.interfaces.Colectie;

import java.util.List;

public class LocuintaVanzare implements Colectie {

    private Float id;
    private List<CameraInchiriere> camere;
    private int nrBai;
    private int nrPersoane;
    private int locDeParcare;
    private boolean incalzire;
    private Double pret;
    private String locatie;
    private Float suprafata;
    private int anConstructieBloc;
    private boolean esteReabilitat;


    @Override
    public void render() {
        System.out.println("SPRE VANZARE: LOCUINTA");
    }
}
