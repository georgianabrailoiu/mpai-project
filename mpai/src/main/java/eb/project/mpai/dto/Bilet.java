package eb.project.mpai.dto;

public class Bilet {

    private String tipBilet;
    private String tipEveniment;
    private String loc;
    private String numeEveniment;
    private String data;
    private int capacitate;
    private String locatie;


    public String getTipEveniment() {
        return tipEveniment;
    }

    public void setTipEveniment(String tipEveniment) {
        this.tipEveniment = tipEveniment;
    }

    public String getTipBilet() {
        return tipBilet;
    }

    public void setTipBilet(String tipBilet) {
        this.tipBilet = tipBilet;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getNumeEveniment() {
        return numeEveniment;
    }

    public void setNumeEveniment(String numeEveniment) {
        this.numeEveniment = numeEveniment;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "tipBilet='" + tipBilet + '\'' +
                ", tipEveniment='" + tipEveniment + '\'' +
                ", loc='" + loc + '\'' +
                ", numeEveniment='" + numeEveniment + '\'' +
                ", data='" + data + '\'' +
                ", capacitate=" + capacitate +
                ", locatie='" + locatie + '\'' +
                '}';
    }
}


