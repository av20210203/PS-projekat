/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import components.NivoTableModel;
import domain.NivoFizickeSpreme;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logic.Controller;

/**
 *
 * @author Aleksa
 */
public class FrmNivoFizickeSpreme extends javax.swing.JFrame {

    /**
     * Creates new form FrmNivoFizickeSpreme
     */
    public FrmNivoFizickeSpreme() {
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKreiraj = new javax.swing.JButton();
        btnIzađi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNivo = new javax.swing.JTable();
        btnPretrazi = new javax.swing.JButton();
        txtNaziv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDetaljiNaziv = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetaljiOpis = new javax.swing.JTextArea();
        lblPoruka = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDetalji = new javax.swing.JButton();
        btnPrikaziSve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKreiraj.setText("Kreiraj");
        btnKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajActionPerformed(evt);
            }
        });

        btnIzađi.setText("Izađi");
        btnIzađi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzađiActionPerformed(evt);
            }
        });

        tblNivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblNivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNivo);

        btnPretrazi.setText("Pretraži");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        jLabel1.setText("Nivo:");

        txtDetaljiNaziv.setEditable(false);

        txtDetaljiOpis.setEditable(false);
        txtDetaljiOpis.setColumns(20);
        txtDetaljiOpis.setRows(5);
        jScrollPane2.setViewportView(txtDetaljiOpis);

        jLabel2.setText("Naziv:");

        jLabel3.setText("Opis:");

        btnDetalji.setText("Detalji");
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        btnPrikaziSve.setText("Prikaži sve");
        btnPrikaziSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDetaljiNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(btnPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPrikaziSve)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDetalji))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnKreiraj)
                                .addGap(445, 445, 445))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIzađi)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPretrazi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrikaziSve, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDetalji))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnKreiraj)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDetaljiNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIzađi))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        try {
            NivoFizickeSpreme n = new NivoFizickeSpreme();
            JDialog dialog = new JDialog(this, "Kreiraj nivo fizičke spreme", true);
            JPanel panel = new FrmAddNivoFizickeSpreme(n);
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            Controller controller = Controller.getInstance();
            controller.createNivoFizickeSpreme(n);
            JOptionPane.showMessageDialog(this, "Sistem je kreirao nivo fizičke spreme!", "Kreiraj nivo fizičke spreme", JOptionPane.INFORMATION_MESSAGE);
            dialog.setVisible(true);
            fillTableNivo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne može da kreira nivo fizičke spreme!" + ex.getMessage(), "Kreiraj nivo fizičke spreme", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void btnIzađiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzađiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnIzađiActionPerformed

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        try {
            String naziv = txtNaziv.getText().trim();
           
            
            List<NivoFizickeSpreme> nivoi = Controller.getInstance().pretraziNivo(naziv);
            nivoi = nivoi.stream()
    .filter(nivo -> !(nivo.getIdNivoFizickeSpreme() == 12 || nivo.getNivo().equals("")))
    .collect(Collectors.toList());
            TableModel nivoTableModel = new NivoTableModel(nivoi);
            tblNivo.setModel(nivoTableModel);
            if (nivoi.isEmpty()) {
                lblPoruka.setText("Sistem ne može da nađe nivoe fizičke spreme po zadatim kriterijumima.");
                return;
            }
            
            lblPoruka.setText("Sistem je našao nivoe fizičke spreme po zadatim kriterijumima.");
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmNivoFizickeSpreme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void tblNivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNivoMouseClicked
       
    }//GEN-LAST:event_tblNivoMouseClicked

    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
try{
        if (tblNivo.getSelectedRow() != -1) {
            int row = tblNivo.getSelectedRow();
       
            NivoTableModel model = (NivoTableModel) tblNivo.getModel();
            NivoFizickeSpreme nivo = model.getNivo(row);
            txtDetaljiNaziv.setText(nivo.getNivo());
            txtDetaljiOpis.setText(nivo.getOpis());
            lblPoruka.setText("Sistem je našao nivo fizičke spreme");
        } else {
                 txtDetaljiNaziv.setText("");
                 txtDetaljiOpis.setText("");
            lblPoruka.setText("Sistem ne može da nađe nivo fizičke spreme");
        }      
}catch(Exception e){
    lblPoruka.setText("Sistem ne može da nađe nivo fizičke spreme");
}
    }//GEN-LAST:event_btnDetaljiActionPerformed

    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed
        fillTableNivo();
    }//GEN-LAST:event_btnPrikaziSveActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalji;
    private javax.swing.JButton btnIzađi;
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnPrikaziSve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JTable tblNivo;
    private javax.swing.JTextField txtDetaljiNaziv;
    private javax.swing.JTextArea txtDetaljiOpis;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
    initComponents();
   tblNivo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    }

private void fillTableNivo() {
    try {
        Controller controller = Controller.getInstance();
        List<NivoFizickeSpreme> nivoi = controller.getAllNivo();
        nivoi = nivoi.stream()
    .filter(nivo -> !(nivo.getIdNivoFizickeSpreme() == 12 || nivo.getNivo().equals("")))
    .collect(Collectors.toList());
        TableModel nivoTableModel = new NivoTableModel(nivoi);
            tblNivo.setModel(nivoTableModel);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Greška pri učitavanju nivoa fizičke spreme: " + ex.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
    }
}
   
}
