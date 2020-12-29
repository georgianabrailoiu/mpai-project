package eb.project.mpai.domain;

import eb.project.mpai.domain.interfaces.Colectie;

import java.util.List;

public class LocuintaInchiriere implements Colectie {

    private Float id;
    private List<CameraInchiriere> camere;
    private int nrBai;
    private int nrPersoane;
    private int locDeParcare;
    private boolean incalzire;
    private Double pret;
    private int nrZile;

    @Override
    public void render() {
        System.out.println("Inchiriere: LOCUINTA");
    }
}
