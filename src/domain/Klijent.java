package domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleksa
 */
public class Klijent {
    private Long idKlijent;
    private String ime;
    private String prezime; 
    private String email;
    private NivoFizickeSpreme nivoFizickeSpreme;

    public Klijent() {
    }

    public Klijent(String ime, String prezime, String email, NivoFizickeSpreme nivoFizickeSpreme) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.nivoFizickeSpreme = nivoFizickeSpreme;
    }

    public Klijent(Long idKlijent, String ime, String prezime, String email, NivoFizickeSpreme nivoFizickeSpreme) {
        this.idKlijent = idKlijent;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.nivoFizickeSpreme = nivoFizickeSpreme;
    }

    public Long getIdKlijent() {
        return idKlijent;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    public NivoFizickeSpreme getNivoFizickeSpreme() {
        return nivoFizickeSpreme;
    }

    public void setIdKlijent(Long idKlijent) {
        this.idKlijent = idKlijent;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNivoFizickeSpreme(NivoFizickeSpreme nivoFizickeSpreme) {
        this.nivoFizickeSpreme = nivoFizickeSpreme;
    }

    @Override
    public String toString() {
        return "Klijent{" + "idKlijent=" + idKlijent + ", ime=" + ime + ", prezime=" + prezime + ", email=" + email + ", nivoFizickeSpreme=" + nivoFizickeSpreme + '}';
    }
    
    
}
