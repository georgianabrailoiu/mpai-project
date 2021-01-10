package eb.project.mpai.domain;



import eb.project.mpai.domain.interfaces.State;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "utilizatori")
public class Utilizator implements State  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nume;
    private String email;
    private String parola;
    private String nrTel;
    private String adresa;
    private String codPostal;
    private Integer varsta;
    private String stareCivila;
    /*  Mirela */
    private transient State stare;

    @OneToMany(mappedBy="utilizator")
    private Set<Rezervare> rezervareList;


    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public String getStareCivila() {
        return stareCivila;
    }

    public void setStareCivila(String stareCivila) {
        this.stareCivila = stareCivila;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    /*  Mirela */

    public void setStare(State stare) {
        this.stare = stare;
    }

    public State getStare() {
        return stare;
    }

    @Override
    public void doAction() {
        this.stare.doAction();
    }

//    public Set<Rezervare> getRezervareList() {
//        return rezervareList;
//    }
//
//    public void setRezervareList(Set<Rezervare> rezervareList) {
//        this.rezervareList = rezervareList;
//    }
}