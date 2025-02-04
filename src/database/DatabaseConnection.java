/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aleksa
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    
    private DatabaseConnection() {
        String url = "jdbc:mysql://localhost:3306/projekat";
        String user = "root";
        String password = "admin";
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Konekcija sa bazom podataka uspesno uspostavljena!");
        } catch (SQLException ex) {
            System.out.println("Greska! Konekcija sa bazom nije uspesno uspostavljena!\n" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null)
            instance = new DatabaseConnection();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
