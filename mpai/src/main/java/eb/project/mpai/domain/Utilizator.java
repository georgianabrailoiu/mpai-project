package eb.project.mpai.domain;



import eb.project.mpai.domain.interfaces.State;

import javax.persistence.*;

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

    @Override
    public String toString() {
        return "Nume: " + nume + "\n" +
                "E-mail: " + email + "\n" +
                "Parola: " + parola + "\n" +
                "Numar de telefon: " + nrTel + "\n" +
                "Adresa: " + adresa + "\n" +
                "Cod postal: " + codPostal + "\n" +
                "Varsta: " + varsta + "\n" +
                "Stare civila: " + stareCivila + "\n";
    }

    // Anca
    private Utilizator(BuilderUtilizator builder){
        this.nume = builder.nume;
        this.email = builder.email;
        this.parola = builder.parola;
        this.nrTel = builder.nrTel;
        this.adresa = builder.adresa;
        this.codPostal = builder.codPostal;
        this.varsta = builder.varsta;
        this.stareCivila = builder.stareCivila;
    }

    public Utilizator(){

    }

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

    public static class BuilderUtilizator {
        //componente obligatorii
        private String nume;
        private String email;
        private String parola;
        private String nrTel;

        //componente optionale
        private String adresa;
        private String codPostal;
        private Integer varsta;
        private String stareCivila;

        public BuilderUtilizator(String nume, String email, String parola, String nrTel){
            this.nume = nume;
            this.email = email;
            this.parola = parola;
            this.nrTel = nrTel;
        }

        public BuilderUtilizator setAdresa(String adresa){
            this.adresa = adresa;
            return this;
        }

        public BuilderUtilizator setCodPostal (String codPostal){
            this.codPostal = codPostal;
            return this;
        }

        public BuilderUtilizator setVarsta(Integer varsta){
            this.varsta = varsta;
            return this;
        }

        public BuilderUtilizator setStareCivila(String stareCivila){
            this.stareCivila = stareCivila;
            return this;
        }

        public Utilizator build() {return new Utilizator(this);}
    }

}

