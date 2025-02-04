/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Klijent;
import domain.NivoFizickeSpreme;
import domain.Sertifikat;
import domain.Trener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    public void registerTrener(Trener trener, List<Sertifikat> sertifikati) throws SQLException {
        
        Connection connection = DatabaseConnection.getInstance().getConnection();
        
        String query = "INSERT INTO trener (ime, prezime, korisnickoIme, sifra, email) VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
         
            statement.setString(1, trener.getIme());
            statement.setString(2, trener.getPrezime());
            statement.setString(3, trener.getKorisnickoIme());
            statement.setString(4, trener.getSifra());
             statement.setString(5, trener.getEmail());
            
            int result = statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                trener.setIdTrener(rsID.getLong(1));
            }
            rsID.close();
            statement.close();

            System.out.println("Vrednost generisanog primarnog kljuca je: " + trener.getIdTrener());
            System.out.println("Objekat Trener uspesno dodat u bazu!");
            
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
        
        String query = "INSERT INTO klijent (ime, prezime, email, idNivoFizickeSpreme) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        
        statement.setString(1, klijent.getIme());
            statement.setString(2, klijent.getPrezime());
             statement.setString(3, klijent.getEmail());
             statement.setLong(4, klijent.getNivoFizickeSpreme().getIdNivoFizickeSpreme());
             
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
    
}
