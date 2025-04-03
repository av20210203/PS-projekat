/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.DatabaseConnection;
import domain.EvidencijaTreninga;
import domain.Klijent;
import domain.NivoFizickeSpreme;
import domain.Sertifikat;
import domain.StavkaEvidencijeTreninga;
import domain.Termin;
import domain.Trener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
/**
 *
 * @author Aleksa
 */
public class DatabaseBroker {

    public DatabaseBroker() {
    }

    public Trener getTrenerByPass(Trener trener) throws Exception{
        try {
            Connection connection = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT idTrener, ime, prezime, korisnickoIme, sifra, email FROM trener WHERE BINARY korisnickoIme=? AND BINARY sifra=?";

            

           
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, trener.getKorisnickoIme());
            statement.setString(2, trener.getSifra());
           
            ResultSet rs = statement.executeQuery();

           
            if (rs.next()) {
                trener.setIdTrener(rs.getLong("idTrener"));
                trener.setIme(rs.getString("ime"));
                trener.setPrezime(rs.getString("prezime"));
                trener.setEmail(rs.getString("email"));
            } else {
                throw new Exception("Ne postoji trener sa zadatim kredencijalima!");
            }
            
            rs.close();
            statement.close();
            System.out.println("Uspesno ucitavanje objekta Trener iz baze!");
            return trener;
        } catch (SQLException ex) {
            System.out.println("Objekat Trener nije uspesno ucitan iz baze!");
            ex.printStackTrace();
            throw ex;
        }
    }

    public void createTreneri(Trener trener) throws SQLException {
        
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String email = "temp_email_" + UUID.randomUUID().toString() + "@example.com";
        String username = "temp_username_" + UUID.randomUUID().toString();
        String query = "INSERT INTO trener (ime, prezime, korisnickoIme, sifra, email) VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
         
            statement.setString(1, "");
            statement.setString(2, "");
            statement.setString(3, username);
            statement.setString(4, "");
             statement.setString(5, email);
            
            int result = statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                trener.setIdTrener(rsID.getLong(1));
            }
            rsID.close();
            statement.close();

            System.out.println("Vrednost generisanog primarnog kljuca je: " + trener.getIdTrener());
            System.out.println("Objekat Trener uspesno dodat u bazu!");
            
           
    }

    public List<NivoFizickeSpreme> getAllNivos() throws SQLException {
        List<NivoFizickeSpreme> nivoi = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String query = "SELECT idNivoFizickeSpreme, nivo, opis FROM nivofizickespreme";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
                
                Long id = rs.getLong("idNivoFizickeSpreme");
               String naziv = rs.getString("nivo");
               String opis = rs.getString("opis");
               NivoFizickeSpreme nivo = new NivoFizickeSpreme(id,naziv,opis);
                nivoi.add(nivo);
            }
        rs.close();
        statement.close();
        return nivoi;
    }

    public void createKlijenti(Klijent klijent) throws SQLException {
   Connection connection = DatabaseConnection.getInstance().getConnection();
         String email = "temp_email_" + UUID.randomUUID().toString() + "@example.com";
       
        String query = "INSERT INTO klijent (ime, prezime, email, idNivoFizickeSpreme) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        
        statement.setString(1,  "");
            statement.setString(2, "");
             statement.setString(3, email);
             statement.setLong(4, 12);
             
             int result = statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                klijent.setIdKlijent(rsID.getLong(1));
            }
            rsID.close();
            statement.close();

            System.out.println("Vrednost generisanog primarnog kljuca je: " + klijent.getIdKlijent());
            System.out.println("Objekat Klijent uspesno dodat u bazu!");
    }

    public List<Sertifikat> getAllSertifikati() throws SQLException {
         List<Sertifikat> sertifikati = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String query = "SELECT idSertifikat, naziv, opis FROM sertifikat";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
                
                Long id = rs.getLong("idSertifikat");
               String naziv = rs.getString("naziv");
               String opis = rs.getString("opis");
               Sertifikat sertifikat = new Sertifikat(id, naziv, opis);
                sertifikati.add(sertifikat);
            }
        rs.close();
        statement.close();
        return sertifikati;
    }

    public void ubaciSertifikati(Sertifikat sertifikat) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        
        String query = "INSERT INTO sertifikat (naziv, opis) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        
            statement.setString(1, sertifikat.getNaziv());
            statement.setString(2, sertifikat.getOpis());
             
             
             int result = statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                sertifikat.setIdSertifikat(rsID.getLong(1));
            }
            rsID.close();
            statement.close();

            System.out.println("Vrednost generisanog primarnog kljuca je: " + sertifikat.getIdSertifikat());
            System.out.println("Objekat Sertifikat uspesno dodat u bazu!");
    }

    public void createNivoiFizickeSpreme(NivoFizickeSpreme n) throws SQLException {
Connection connection = DatabaseConnection.getInstance().getConnection();
 
        String query = "INSERT INTO nivofizickespreme (nivo, opis) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        
            statement.setString(1, "");
            statement.setString(2, "");
             
             
             int result = statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                n.setIdNivoFizickeSpreme(rsID.getLong(1));
            }
            rsID.close();
            statement.close();

            System.out.println("Vrednost generisanog primarnog kljuca je: " + n.getIdNivoFizickeSpreme());
            System.out.println("Objekat Termin uspesno dodat u bazu!");
    }

    public void createTermini(Termin termin) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        
        String query = "INSERT INTO termin (datum, cenaPoSatu) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        
            statement.setDate(1, Date.valueOf(LocalDate.now()));
            statement.setLong(2, 0);
             
             
             int result = statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                termin.setIdTermin(rsID.getLong(1));
            }
            rsID.close();
            statement.close();

            System.out.println("Vrednost generisanog primarnog kljuca je: " + termin.getIdTermin());
            System.out.println("Objekat Termin uspesno dodat u bazu!");
    }

    public List<Trener> getAllTreneri() throws SQLException {
        List<Trener> treneri = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String query = "SELECT idTrener, ime, prezime, korisnickoIme, sifra, email FROM trener";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
                
                Long id = rs.getLong("idTrener");
               String ime = rs.getString("ime");
               String prezime = rs.getString("prezime");
               String username = rs.getString("korisnickoIme");
               String pass = rs.getString("sifra");
               String email = rs.getString("email");
               Trener trener = new Trener(id,ime,prezime,username,pass,email);
                treneri.add(trener);
            }
        rs.close();
        statement.close();
        return treneri;
    }

    public List<Klijent> getAllKlijenti() throws SQLException {
        List<Klijent> klijenti = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT k.*, n.idNivoFizickeSpreme, n.nivo " + 
                 "FROM klijent k " + 
                 "JOIN nivofizickespreme n ON k.idNivoFizickeSpreme = n.idNivoFizickeSpreme";
                 
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
                
                Long id = rs.getLong("idKlijent");
               String ime = rs.getString("ime");
               String prezime = rs.getString("prezime");
               String email = rs.getString("email");
               NivoFizickeSpreme nivo = new NivoFizickeSpreme();
        nivo.setIdNivoFizickeSpreme(rs.getLong("n.idNivoFizickeSpreme"));
        nivo.setNivo(rs.getString("n.nivo"));
               Klijent klijent = new Klijent(id,ime,prezime,email,nivo);
                klijenti.add(klijent);
            }
        rs.close();
        statement.close();
        return klijenti;
    }

    public List<Termin> getAllTermini() throws SQLException {
    List<Termin> termini = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String query = "SELECT idTermin, datum, cenaPoSatu FROM termin";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
                
                Long id = rs.getLong("idTermin");
                LocalDate datum = rs.getDate("datum").toLocalDate();
               Long cenaPoSatu = rs.getLong("cenaPoSatu");
              
               Termin termin = new Termin(id,datum,cenaPoSatu);
                termini.add(termin);
            }
        rs.close();
        statement.close();
        return termini;
    }

    public void createEvidencijeTreninga(EvidencijaTreninga ev) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        
        String query = "INSERT INTO evidencijatreninga (ukupnaCena, idKlijent, idTrener ) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        
            statement.setLong(1, 0);
            statement.setLong(2, 42);
            statement.setLong(3, 123);
             
             
             int result = statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                ev.setIdEvidencijaTreninga(rsID.getLong(1));
            }
            rsID.close();
            statement.close();

            System.out.println("Vrednost generisanog primarnog kljuca je: " + ev.getIdEvidencijaTreninga());
            System.out.println("Objekat Evidencija treninga uspesno dodata u bazu!");
            
          
            
            }
        
    

    public void updateKlijenti(Klijent klijent) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();   
            
            String query = "UPDATE klijent SET ime = ?, prezime = ?, email = ?, idNivoFizickeSpreme = ? WHERE idKlijent=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, klijent.getIme());
            ps.setString(2, klijent.getPrezime());
            ps.setString(3, klijent.getEmail());
            ps.setLong(4, klijent.getNivoFizickeSpreme().getIdNivoFizickeSpreme());
            ps.setLong(5, klijent.getIdKlijent());
            ps.executeUpdate();
            ps.close();
    }

    public void updateTreneri(Trener trener, List<Sertifikat> sertifikati) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();   
            
            String query = "UPDATE trener SET ime = ?, prezime = ?, korisnickoIme=?, sifra=?, email = ? WHERE idTrener=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, trener.getIme());
            ps.setString(2, trener.getPrezime());
            ps.setString(3, trener.getKorisnickoIme());
            ps.setString(4, trener.getSifra());
            ps.setString(5, trener.getEmail());
            ps.setLong(6, trener.getIdTrener());
            ps.executeUpdate();
            ps.close();
            
             String query1 = "INSERT INTO ts (idTrener, idSertifikat, datum) VALUES (?,?,?)";
        PreparedStatement statementSertifikat = connection.prepareStatement(query1);

        for (Sertifikat s : sertifikati) {
            statementSertifikat.setLong(1, trener.getIdTrener()); 
            statementSertifikat.setLong(2, s.getIdSertifikat()); 
            statementSertifikat.setDate(3, Date.valueOf(LocalDate.now()));
            statementSertifikat.executeUpdate();
        }

        statementSertifikat.close();
        System.out.println("Sertifikati uspesno povezani sa trenerom!");
         
    }

    public void updateTermini(Termin termin) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();   
            
            String query = "UPDATE termin SET datum = ?, cenaPoSatu = ? WHERE idTermin=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setDate(1, Date.valueOf(termin.getDatum()));
            ps.setLong(2, termin.getCenaPoSatu());
            ps.setLong(3, termin.getIdTermin());
            
            ps.executeUpdate();
            ps.close();
    }

    public void updateNivoiFizickeSpreme(NivoFizickeSpreme n) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();   
            
            String query = "UPDATE nivofizickespreme SET nivo = ?, opis = ? WHERE idNivoFizickeSpreme = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, n.getNivo());
            ps.setString(2, n.getOpis());
            ps.setLong(3, n.getIdNivoFizickeSpreme());
            
            ps.executeUpdate();
            ps.close();
    }

    public void updateEvidencijeTreninga(EvidencijaTreninga ev, List<StavkaEvidencijeTreninga> stavke) throws SQLException {
 Connection connection = DatabaseConnection.getInstance().getConnection();   
            
            String query = "UPDATE evidencijatreninga SET ukupnaCena = ?, idKlijent = ?, idTrener = ? WHERE idEvidencijaTreninga = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setLong(1, ev.getUkupnaCena());
            ps.setLong(2, ev.getKlijent().getIdKlijent());
            ps.setLong(3, ev.getTrener().getIdTrener());
            ps.setLong(4, ev.getIdEvidencijaTreninga());
            ps.executeUpdate();
            ps.close();
              for(StavkaEvidencijeTreninga stavka : stavke){
            String query1 = "INSERT INTO stavkaevidencijetreninga (idEvidencijaTreninga, rb, ocena, vremeOd, vremeDo, cena, idTermin) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement1 = connection.prepareStatement(query1);
            
            statement1.setLong(1, ev.getIdEvidencijaTreninga());
            statement1.setLong(2, stavka.getRb());
            statement1.setLong(3, stavka.getOcena());
            statement1.setTime(4, Time.valueOf(stavka.getVremeOd()));
            statement1.setTime(5, Time.valueOf(stavka.getVremeDo()));
            statement1.setLong(6, stavka.getCena());
            statement1.setLong(7, stavka.getTermin().getIdTermin());
            
            int result1 = statement1.executeUpdate();
    }

  
    
    
}

    public List<NivoFizickeSpreme> pretraziNivoe(String naziv) throws SQLException {
         List<NivoFizickeSpreme> nivoi = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM nivofizickespreme WHERE nivo LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + naziv + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            NivoFizickeSpreme nivo = new NivoFizickeSpreme();
            nivo.setIdNivoFizickeSpreme(rs.getLong("idNivoFizickeSpreme"));  
            nivo.setNivo(rs.getString("nivo"));
            nivo.setOpis(rs.getString("opis"));
            nivoi.add(nivo);
        }
        return nivoi;
    }

    public List<Sertifikat> pretraziSertifikate(String naziv) throws SQLException {
        List<Sertifikat> sertifikati = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM sertifikat WHERE naziv LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + naziv + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Sertifikat sertifikat = new Sertifikat();
            sertifikat.setIdSertifikat(rs.getLong("idSertifikat"));  
            sertifikat.setNaziv(rs.getString("naziv"));
            sertifikat.setOpis(rs.getString("opis"));
            sertifikati.add(sertifikat);
        }
        return sertifikati;
        }

    public List<Termin> pretraziTermine(LocalDate datum, Long cena) throws SQLException {
        List<Termin> termini = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM termin WHERE datum LIKE ? AND cenaPoSatu LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(datum));
        ps.setLong(2, cena);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Termin termin = new Termin();
            termin.setIdTermin(rs.getLong("idTermin"));  
            termin.setDatum(rs.getDate("datum").toLocalDate());
            termin.setCenaPoSatu(rs.getLong("cenaPoSatu"));
            termini.add(termin);
        }
        return termini;
    }

    public List<Termin> pretraziTermine(LocalDate datum) throws SQLException {
        List<Termin> termini = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM termin WHERE datum LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(datum));
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Termin termin = new Termin();
            termin.setIdTermin(rs.getLong("idTermin"));  
            termin.setDatum(rs.getDate("datum").toLocalDate());
            termin.setCenaPoSatu(rs.getLong("cenaPoSatu"));
            termini.add(termin);
        }
        return termini;
    }

    public List<Termin> pretraziTermine(Long cena) throws SQLException {
        List<Termin> termini = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM termin WHERE cenaPoSatu LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, cena);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Termin termin = new Termin();
            termin.setIdTermin(rs.getLong("idTermin"));  
            termin.setDatum(rs.getDate("datum").toLocalDate());
            termin.setCenaPoSatu(rs.getLong("cenaPoSatu"));
            termini.add(termin);
        }
        return termini;
    }

    public List<Klijent> pretraziKlijente(NivoFizickeSpreme nivo, String ime) throws SQLException {
        List<Klijent> klijenti = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM klijent WHERE idNivoFizickeSpreme LIKE ? AND ime LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, nivo.getIdNivoFizickeSpreme());
        ps.setString(2, "%" + ime + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Klijent klijent = new Klijent();
            klijent.setIdKlijent(rs.getLong("idKlijent"));  
            klijent.setIme(rs.getString("ime"));
            klijent.setPrezime(rs.getString("prezime"));
            klijent.setEmail(rs.getString("email"));
            klijent.setNivoFizickeSpreme(nivo);
            klijenti.add(klijent);
        }
        return klijenti;
    }

    public List<Klijent> pretraziKlijenteP(NivoFizickeSpreme nivo, String prezime) throws SQLException {
        List<Klijent> klijenti = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM klijent WHERE idNivoFizickeSpreme LIKE ? AND prezime LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, nivo.getIdNivoFizickeSpreme());
        ps.setString(2, "%" + prezime + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Klijent klijent = new Klijent();
            klijent.setIdKlijent(rs.getLong("idKlijent"));  
            klijent.setIme(rs.getString("ime"));
            klijent.setPrezime(rs.getString("prezime"));
            klijent.setEmail(rs.getString("email"));
            klijent.setNivoFizickeSpreme(nivo);
            klijenti.add(klijent);
        }
        return klijenti;
    }

    public List<Klijent> pretraziKlijente(String ime, String prezime) throws SQLException {
    List<Klijent> klijenti = new ArrayList<>();
    Connection connection = DatabaseConnection.getInstance().getConnection();
    
    String sql = "SELECT k.*, n.idNivoFizickeSpreme, n.nivo " + 
                 "FROM klijent k " + 
                 "JOIN nivofizickespreme n ON k.idNivoFizickeSpreme = n.idNivoFizickeSpreme " + 
                 "WHERE k.ime LIKE ? AND k.prezime LIKE ?";
    
    PreparedStatement ps = connection.prepareStatement(sql);
    ps.setString(1, "%" + ime + "%");
    ps.setString(2, "%" + prezime + "%");
    
    ResultSet rs = ps.executeQuery();
    
    while (rs.next()) {
        Klijent klijent = new Klijent();
        klijent.setIdKlijent(rs.getLong("idKlijent"));
        klijent.setIme(rs.getString("ime"));
        klijent.setPrezime(rs.getString("prezime"));
        klijent.setEmail(rs.getString("email"));

        
        NivoFizickeSpreme nivo = new NivoFizickeSpreme();
        nivo.setIdNivoFizickeSpreme(rs.getLong("n.idNivoFizickeSpreme"));
        nivo.setNivo(rs.getString("n.nivo"));

        
        klijent.setNivoFizickeSpreme(nivo);

        klijenti.add(klijent);
    }

    return klijenti;
}


    public List<Klijent> pretraziKlijente(NivoFizickeSpreme nivo) throws SQLException {
         List<Klijent> klijenti = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM klijent WHERE idNivoFizickeSpreme LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1,nivo.getIdNivoFizickeSpreme());
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Klijent klijent = new Klijent();
            klijent.setIdKlijent(rs.getLong("idKlijent"));  
            klijent.setIme(rs.getString("ime"));
            klijent.setPrezime(rs.getString("prezime"));
            klijent.setEmail(rs.getString("email"));
            klijent.setNivoFizickeSpreme(nivo);
            klijenti.add(klijent);
        }
        return klijenti;
    }

    public List<Klijent> pretraziKlijente(String ime) throws SQLException {
        List<Klijent> klijenti = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT k.*, n.idNivoFizickeSpreme, n.nivo " + 
                 "FROM klijent k " + 
                 "JOIN nivofizickespreme n ON k.idNivoFizickeSpreme = n.idNivoFizickeSpreme " + 
                 "WHERE k.ime LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
       ps.setString(1, "%" + ime + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Klijent klijent = new Klijent();
            klijent.setIdKlijent(rs.getLong("idKlijent"));  
            klijent.setIme(rs.getString("ime"));
            klijent.setPrezime(rs.getString("prezime"));
            klijent.setEmail(rs.getString("email"));
           NivoFizickeSpreme nivo = new NivoFizickeSpreme();
        nivo.setIdNivoFizickeSpreme(rs.getLong("n.idNivoFizickeSpreme"));
        nivo.setNivo(rs.getString("n.nivo"));

        
        klijent.setNivoFizickeSpreme(nivo);
            klijenti.add(klijent);
        }
        return klijenti;
    }

    public List<Klijent> pretraziKlijenteP(String prezime) throws SQLException {
        List<Klijent> klijenti = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT k.*, n.idNivoFizickeSpreme, n.nivo " + 
                 "FROM klijent k " + 
                 "JOIN nivofizickespreme n ON k.idNivoFizickeSpreme = n.idNivoFizickeSpreme " + 
                 "WHERE k.prezime LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
       ps.setString(1, "%" + prezime + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Klijent klijent = new Klijent();
            klijent.setIdKlijent(rs.getLong("idKlijent"));  
            klijent.setIme(rs.getString("ime"));
            klijent.setPrezime(rs.getString("prezime"));
            klijent.setEmail(rs.getString("email"));
           NivoFizickeSpreme nivo = new NivoFizickeSpreme();
        nivo.setIdNivoFizickeSpreme(rs.getLong("n.idNivoFizickeSpreme"));
        nivo.setNivo(rs.getString("n.nivo"));

        
        klijent.setNivoFizickeSpreme(nivo);
            klijenti.add(klijent);
        }
        return klijenti;
    }

    public List<Klijent> pretraziKlijente(NivoFizickeSpreme nivo, String ime, String prezime) throws SQLException {
        List<Klijent> klijenti = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT * FROM klijent WHERE idNivoFizickeSpreme LIKE ? AND ime LIKE ? AND prezime LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, nivo.getIdNivoFizickeSpreme());
        ps.setString(2, "%" + ime + "%");
       ps.setString(3, "%" + prezime + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Klijent klijent = new Klijent();
            klijent.setIdKlijent(rs.getLong("idKlijent"));  
            klijent.setIme(rs.getString("ime"));
            klijent.setPrezime(rs.getString("prezime"));
            klijent.setEmail(rs.getString("email"));
           klijent.setNivoFizickeSpreme(nivo);
            klijenti.add(klijent);
        }
        return klijenti;
    }

   

}
