package eb.project.mpai.domain.bilete;

import eb.project.mpai.domain.Rezervare;
import eb.project.mpai.domain.interfaces.Eveniment;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "BNConcert")
public class BiletNormalConcert implements Eveniment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numeEveniment;
    private String data;
    private int capacitate;
    private String locatie;

    @OneToMany(mappedBy="bnConcert")
    private List<Rezervare> rezervareList;

    @Override
    public void render() {
        System.out.println("Bilet normal: concert - "+ capacitate+" locuri");
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
