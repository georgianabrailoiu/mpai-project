package eb.project.mpai.domain.bilete;

import eb.project.mpai.domain.interfaces.Eveniment;

import java.util.Date;

public class BiletNormalConcert implements Eveniment {

    private Float id;
    private String numeEveniment;
    private String data;
    private int capacitate;
    private String locatie;

    @Override
    public void render() {
        System.out.println("Bilet normal: concert - "+ capacitate+" locuri");
        System.out.println("Eveniment: "+ numeEveniment +" in data de "+ data);
        System.out.println("Locatie: "+ locatie);
    }

    public BiletNormalConcert(String numeEveniment, String data, int capacitate, String locatie) {
        this.numeEveniment = numeEveniment;
        this.data = data;
        this.capacitate = capacitate;
        this.locatie = locatie;
    }
}