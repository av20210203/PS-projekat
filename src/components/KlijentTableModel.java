/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.Klijent;
import domain.Termin;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aleksa
 */
public class KlijentTableModel extends AbstractTableModel{
private List<Klijent> klijenti;
    String[] columns = {"Id","Ime","Prezime"};

    public KlijentTableModel(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }
        
    @Override
    public int getRowCount() {
if (klijenti == null) {
            return 0;
        }
        return klijenti.size();    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Klijent klijent = klijenti.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return klijent.getIdKlijent();
                case 1:
                return klijent.getIme();
                case 2:
                    return klijent.getPrezime();
                
            default:
                throw new AssertionError();
        }
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    public Klijent getKlijent(int row) {
        return klijenti.get(row);
    }
}
