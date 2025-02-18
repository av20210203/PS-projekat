/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.NivoFizickeSpreme;
import domain.Sertifikat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aleksa
 */
public class SertifikatTableModel extends AbstractTableModel{
private List<Sertifikat> sertifikati;
String[] columns = {"Id","Naziv"};
    public SertifikatTableModel(List<Sertifikat> sertifikati) {
        this.sertifikati = sertifikati;
    }


    @Override
    public int getRowCount() {
        if (sertifikati == null) {
            return 0;
        }
        return sertifikati.size(); 
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sertifikat sertifikat = sertifikati.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sertifikat.getIdSertifikat();
                case 1:
                return sertifikat.getNaziv();
            default:
                throw new AssertionError();
        }
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    public Sertifikat getSertifikat(int row) {
        return sertifikati.get(row);
    }
    
}
