package eb.project.mpai.domain;

import eb.project.mpai.domain.interfaces.Colectie;

public class CameraInchiriere implements Colectie {

    private Long id;
    private Boolean areBaieInclusa;
    private String tipPat;
    private int nrPersoane;
    private String detalii;
    private Double pret;
    private int nrZile;



    @Override
    public void render() {
        System.out.println("Inchiriere: CAMERA");
    }
}
