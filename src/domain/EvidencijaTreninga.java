package domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleksa
 */
public class EvidencijaTreninga {
    private Long idEvidencijaTreninga;
    private Long ukupnaCena;
    private Trener trener;
    private Klijent klijent;

    public EvidencijaTreninga(Long idEvidencijaTreninga, Long ukupnaCena, Trener trener, Klijent klijent) {
        this.idEvidencijaTreninga = idEvidencijaTreninga;
        this.ukupnaCena = ukupnaCena;
        this.trener = trener;
        this.klijent = klijent;
    }

    public EvidencijaTreninga() {
    }

    public EvidencijaTreninga(Long ukupnaCena, Trener trener, Klijent klijent) {
        this.ukupnaCena = ukupnaCena;
        this.trener = trener;
        this.klijent = klijent;
    }

    public Long getIdEvidencijaTreninga() {
        return idEvidencijaTreninga;
    }

    public Long getUkupnaCena() {
        return ukupnaCena;
    }

    public Trener getTrener() {
        return trener;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setIdEvidencijaTreninga(Long idEvidencijaTreninga) {
        this.idEvidencijaTreninga = idEvidencijaTreninga;
    }

    public void setUkupnaCena(Long ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    @Override
    public String toString() {
        return "EvidencijaTreninga{" + "idEvidencijaTreninga=" + idEvidencijaTreninga + ", ukupnaCena=" + ukupnaCena + ", trener=" + trener + ", klijent=" + klijent + '}';
    }
    
    
}
