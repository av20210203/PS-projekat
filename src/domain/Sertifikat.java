package domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleksa
 */
public class Sertifikat {
    private Long idSertifikat;
    private String naziv;
    private String opis;

    public Long getIdSertifikat() {
        return idSertifikat;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setIdSertifikat(Long idSertifikat) {
        this.idSertifikat = idSertifikat;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Sertifikat() {
    }

    public Sertifikat(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
    }

    public Sertifikat(Long idSertifikat, String naziv, String opis) {
        this.idSertifikat = idSertifikat;
        this.naziv = naziv;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
}
