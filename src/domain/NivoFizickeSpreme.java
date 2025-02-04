package domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleksa
 */
public class NivoFizickeSpreme {
    private Long idNivoFizickeSpreme;
    private String nivo;
    private String opis;

    public NivoFizickeSpreme() {
    }

    public NivoFizickeSpreme(String nivo, String opis) {
        this.nivo = nivo;
        this.opis = opis;
    }

    public NivoFizickeSpreme(Long idNivoFizickeSpreme, String nivo, String opis) {
        this.idNivoFizickeSpreme = idNivoFizickeSpreme;
        this.nivo = nivo;
        this.opis = opis;
    }

    public Long getIdNivoFizickeSpreme() {
        return idNivoFizickeSpreme;
    }

    public String getNivo() {
        return nivo;
    }

    public String getOpis() {
        return opis;
    }

    public void setIdNivoFizickeSpreme(Long idNivoFizickeSpreme) {
        this.idNivoFizickeSpreme = idNivoFizickeSpreme;
    }

    public void setNivo(String nivo) {
        this.nivo = nivo;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return nivo;
    }
    
    
}
