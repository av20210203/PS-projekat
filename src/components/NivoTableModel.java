/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.NivoFizickeSpreme;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aleksa
 */
public class NivoTableModel extends AbstractTableModel{
private List<NivoFizickeSpreme> nivoi;
    String[] columns = {"Id","Nivo","Opis"};

    public NivoTableModel(List<NivoFizickeSpreme> nivoi) {
        this.nivoi = nivoi;
    }
        
    @Override
    public int getRowCount() {
if (nivoi == null) {
            return 0;
        }
        return nivoi.size();    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NivoFizickeSpreme nivo = nivoi.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return nivo.getIdNivoFizickeSpreme();
                case 1:
                return nivo.getNivo();
                case 2:
                return nivo.getOpis();
                
            default:
                throw new AssertionError();
        }
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
