package eb.project.mpai.domain;

import eb.project.mpai.domain.bilete.*;

import javax.persistence.*;

@Entity
@Table(name = "rezervare")
public class Rezervare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int loc;

    @ManyToOne
    @JoinColumn(name="utilizator_id")
    private Utilizator utilizator;

    @ManyToOne
    @JoinColumn(name="bnCinema_id")
    private BiletNormalCinema bnCinema;

    @ManyToOne
    @JoinColumn(name="bnConcert_id")
    private BiletNormalConcert bnConcert;

    @ManyToOne
    @JoinColumn(name="bnTeatru_id")
    private BiletNormalTeatru bnTeatru;

    @ManyToOne
    @JoinColumn(name="vipCinema_id")
    private BiletVIPCinema vipCinema;

    @ManyToOne
    @JoinColumn(name="vipTeatru_id")
    private BiletVIPTeatru vipTeatru;

    @ManyToOne
    @JoinColumn(name="vipConcert_id")
    private BiletVIPConcert vipConcert;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BiletNormalCinema getEvent() {
        return bnCinema;
    }

    public void setEvent(BiletNormalCinema event) {
        this.bnCinema = event;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    public BiletNormalCinema getBnCinema() {
        return bnCinema;
    }

    public void setBnCinema(BiletNormalCinema bnCinema) {
        this.bnCinema = bnCinema;
    }

    public BiletNormalConcert getBnConcert() {
        return bnConcert;
    }

    public void setBnConcert(BiletNormalConcert bnConcert) {
        this.bnConcert = bnConcert;
    }

    public BiletNormalTeatru getBnTeatru() {
        return bnTeatru;
    }

    public void setBnTeatru(BiletNormalTeatru bnTeatru) {
        this.bnTeatru = bnTeatru;
    }

    public BiletVIPCinema getVipCinema() {
        return vipCinema;
    }

    public void setVipCinema(BiletVIPCinema vipCinema) {
        this.vipCinema = vipCinema;
    }

    public BiletVIPTeatru getVipTeatru() {
        return vipTeatru;
    }

    public void setVipTeatru(BiletVIPTeatru vipTeatru) {
        this.vipTeatru = vipTeatru;
    }

    public BiletVIPConcert getVipConcert() {
        return vipConcert;
    }

    public void setVipConcert(BiletVIPConcert vipConcert) {
        this.vipConcert = vipConcert;
    }
}
