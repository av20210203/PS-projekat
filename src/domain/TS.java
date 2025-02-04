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
public class TS {
    private Trener trener;
    private Sertifikat sertifikat;
    private LocalDate datum;

    public TS() {
    }

    public TS(Trener trener, Sertifikat sertifikat, LocalDate datum) {
        this.trener = trener;
        this.sertifikat = sertifikat;
        this.datum = datum;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    public void setSertifikat(Sertifikat sertifikat) {
        this.sertifikat = sertifikat;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public Trener getTrener() {
        return trener;
    }

    public Sertifikat getSertifikat() {
        return sertifikat;
    }

    public LocalDate getDatum() {
        return datum;
    }
    
    
}
