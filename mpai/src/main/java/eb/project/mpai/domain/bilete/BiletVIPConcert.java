package eb.project.mpai.domain.bilete;

import eb.project.mpai.domain.Rezervare;
import eb.project.mpai.domain.Observabil;
import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.domain.interfaces.Eveniment;
import eb.project.mpai.domain.interfaces.Handler;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "BVConcert")
public class BiletVIPConcert extends Observabil implements Eveniment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numeEveniment;
    private String data;
    private int capacitate;
    private String locatie;

    @OneToMany(mappedBy="vipConcert")
    private List<Rezervare> rezervareList;

    @Override
    public void render() {
        Handler utilizator1 = new Utilizator("Anca", "anca.bute@gmail.com");
        Handler utilizator2 = new Utilizator("Maria", "maria.pitis@gmail.com");
        Handler utilizator3 = new Utilizator("Gigi", "gigi.brailoiu@gmail.com");
        Handler utilizator4 = new Utilizator("Mirela", "mirela.bordeeanu@gmail.com");

        this.addUtilizatori(utilizator1);
        this.addUtilizatori(utilizator2);
        this.addUtilizatori(utilizator3);
        this.addUtilizatori(utilizator4);
        this.notifyObservers("concert VIP");
        System.out.println("Bilet VIP: concert - "+ capacitate+" locuri");
        System.out.println("Eveniment: "+ numeEveniment +" in data de "+ data);
        System.out.println("Locatie: "+ locatie);
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Rezervare> getRezervareList() {
        return rezervareList;
    }

    public void setRezervareList(List<Rezervare> rezervareList) {
        this.rezervareList = rezervareList;
    }
}
