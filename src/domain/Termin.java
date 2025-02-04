package domain;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleksa
 */
public class Termin {
    private Long idTermin;
    private LocalDate datum;
    private Long cenaPoSatu;

    public Long getIdTermin() {
        return idTermin;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public Long getCenaPoSatu() {
        return cenaPoSatu;
    }

    public void setIdTermin(Long idTermin) {
        this.idTermin = idTermin;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public void setCenaPoSatu(Long cenaPoSatu) {
        this.cenaPoSatu = cenaPoSatu;
    }

    public Termin() {
    }

    public Termin(Long idTermin, LocalDate datum, Long cenaPoSatu) {
        this.idTermin = idTermin;
        this.datum = datum;
        this.cenaPoSatu = cenaPoSatu;
    }

    public Termin(LocalDate datum, Long cenaPoSatu) {
        this.datum = datum;
        this.cenaPoSatu = cenaPoSatu;
    }

    @Override
    public String toString() {
        return "Termin{" + "idTermin=" + idTermin + ", datum=" + datum + ", cenaPoSatu=" + cenaPoSatu + '}';
    }
    
}
