package domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleksa
 */
public class Trener {
    private Long idTrener;
    private String ime;
    private String prezime;
    private String korisnickoIme;
    private String sifra;
    private String email;

    public Long getIdTrener() {
        return idTrener;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getSifra() {
        return sifra;
    }

    public String getEmail() {
        return email;
    }

    public void setIdTrener(Long idTrener) {
        this.idTrener = idTrener;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Trener() {
    }

    public Trener(String korisnickoIme, String sifra) {
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }

    public Trener(Long idTrener, String ime, String prezime, String korisnickoIme, String sifra, String email) {
        this.idTrener = idTrener;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
        this.email = email;
    }

    public Trener(String ime, String prezime, String korisnickoIme, String sifra, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Trener{" + "idTrener=" + idTrener + ", ime=" + ime + ", prezime=" + prezime + ", email=" + email + '}';
    }
    
    
}
