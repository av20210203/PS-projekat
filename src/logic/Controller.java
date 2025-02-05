    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import database.DatabaseBroker;
import domain.Klijent;
import domain.NivoFizickeSpreme;
import domain.Sertifikat;
import domain.Termin;
import domain.Trener;
import java.sql.SQLException;
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

    public void register(Trener trener, List<Sertifikat> sertifikati) throws SQLException {
        dbbr.registerTrener(trener, sertifikati);
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

    public void createSertifikat(Sertifikat sertifikat) throws SQLException {
        dbbr.createSertifikati(sertifikat);   
    }

    public void createNivo(NivoFizickeSpreme n) throws SQLException {
    dbbr.createNivoi(n);
    }

    public void createTermin(Termin termin) {
        dbbr.createTermini(termin);
    }
}
