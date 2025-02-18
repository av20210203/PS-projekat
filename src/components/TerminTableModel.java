/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.NivoFizickeSpreme;
import domain.Termin;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aleksa
 */
public class TerminTableModel extends AbstractTableModel{
private List<Termin> termini;
    String[] columns = {"Id","Datum"};

    public TerminTableModel(List<Termin> termini) {
        this.termini = termini;
    }
        
    @Override
    public int getRowCount() {
if (termini == null) {
            return 0;
        }
        return termini.size();    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Termin termin = termini.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return termin.getIdTermin();
                case 1:
                return termin.getDatum();
                
                
            default:
                throw new AssertionError();
        }
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    public Termin getTermin(int row) {
        return termini.get(row);
    }
}