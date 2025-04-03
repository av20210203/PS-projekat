    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import database.DatabaseBroker;
import domain.EvidencijaTreninga;
import domain.Klijent;
import domain.NivoFizickeSpreme;
import domain.Sertifikat;
import domain.StavkaEvidencijeTreninga;
import domain.Termin;
import domain.Trener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Aleksa
 */
public class Controller {
    private static Controller instance;
    private DatabaseBroker dbbr;
    
    private Controller() {
        dbbr = new DatabaseBroker();
    }

    public static Controller getInstance() {
        if (instance == null)
            instance = new Controller();
        return instance;
    }
    
    public Trener login(Trener trener) throws Exception{
        return dbbr.getTrenerByPass(trener);
    }

    public void createTrener(Trener trener) throws SQLException {
        dbbr.createTreneri(trener);
    }

    public List<NivoFizickeSpreme> getAllNivo() throws SQLException {
         return dbbr.getAllNivos();
    }

    public void createKlijent(Klijent klijent) throws SQLException {
        dbbr.createKlijenti(klijent);
    }

    public List<Sertifikat> getAllSertifikat() throws SQLException {
        return dbbr.getAllSertifikati();
    }

    public void ubaciSertifikat(Sertifikat sertifikat) throws SQLException {
        dbbr.ubaciSertifikati(sertifikat);   
    }

    public void createNivoFizickeSpreme(NivoFizickeSpreme n) throws SQLException {
    dbbr.createNivoiFizickeSpreme(n);
    }

    public void createTermin(Termin termin) throws SQLException {
        dbbr.createTermini(termin);
    }

    public List<Trener> getAllTrener() throws SQLException {
   return dbbr.getAllTreneri();
    }

    public List<Klijent> getAllKlijent() throws SQLException {
        return dbbr.getAllKlijenti();
    }

    public List<Termin> getAllTermini() throws SQLException {
        return dbbr.getAllTermini();
    }

    public void createEvidencijaTreninga(EvidencijaTreninga ev) throws SQLException {
        dbbr.createEvidencijeTreninga(ev);
    }

    public void updateKlijent(Klijent klijent) throws SQLException {
        dbbr.updateKlijenti(klijent);
    }

    public void updateTrener(Trener trener, List<Sertifikat> sertifikati) throws SQLException {
    dbbr.updateTreneri(trener, sertifikati);
    }

    public void updateTermin(Termin termin) throws SQLException {
        dbbr.updateTermini(termin);
    }

    public void updateNivoFizickeSpreme(NivoFizickeSpreme n) throws SQLException {
        dbbr.updateNivoiFizickeSpreme(n);
    }

    public void updateEvidencijaTreninga(EvidencijaTreninga ev, List<StavkaEvidencijeTreninga> stavke) throws SQLException {
        dbbr.updateEvidencijeTreninga(ev, stavke);
    }

    public List<NivoFizickeSpreme> pretraziNivo(String naziv) throws SQLException {
        return dbbr.pretraziNivoe(naziv);
    }

    public List<Sertifikat> pretraziSertifikat(String naziv) throws SQLException {
    return dbbr.pretraziSertifikate(naziv);
        }

    public List<Termin> pretraziTermin(LocalDate datum, Long cena) throws SQLException {
        return dbbr.pretraziTermine(datum, cena);
    }

    public List<Termin> pretraziTermin(LocalDate datum) throws SQLException {
        return dbbr.pretraziTermine(datum);
    }

    public List<Termin> pretraziTermin(Long cena) throws SQLException {
        return dbbr.pretraziTermine(cena);
    }

    public List<Klijent> pretraziKlijent(NivoFizickeSpreme nivo, String ime) throws SQLException {
        return dbbr.pretraziKlijente(nivo, ime);
    }

    public List<Klijent> pretraziKlijentP(NivoFizickeSpreme nivo, String prezime) throws SQLException {
        return dbbr.pretraziKlijenteP(nivo, prezime);
    }

    public List<Klijent> pretraziKlijent(String ime, String prezime) throws SQLException {
return dbbr.pretraziKlijente(ime, prezime);
        }

    public List<Klijent> pretraziKlijent(NivoFizickeSpreme nivo) throws SQLException {
        return dbbr.pretraziKlijente(nivo);
    }

    public List<Klijent> pretraziKlijent(String ime) throws SQLException {
        return dbbr.pretraziKlijente(ime);
    }

    public List<Klijent> pretraziKlijentP(String prezime) throws SQLException {
        return dbbr.pretraziKlijenteP(prezime);
    }

    public List<Klijent> pretraziKlijent(NivoFizickeSpreme nivo, String ime, String prezime) throws SQLException {
        return dbbr.pretraziKlijente(nivo,ime,prezime);
    }

    

    

   
}
