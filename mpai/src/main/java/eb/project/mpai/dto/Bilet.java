package eb.project.mpai.dto;

public class Bilet {

    private String tipBilet;
    private String tipEveniment;
    private String pret;
    private String loc;

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

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

