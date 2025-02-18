/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import components.NivoTableModel;
import components.SertifikatTableModel;
import domain.NivoFizickeSpreme;
import domain.Sertifikat;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import logic.Controller;

/**
 *
 * @author Aleksa
 */
public class FrmSertifikat extends javax.swing.JFrame {

    /**
     * Creates new form FrmSertifikat
     */
    public FrmSertifikat() {
        initComponents();
        tblSertifikat.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
        txtNaziv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPretrazi = new javax.swing.JButton();
        btnDetalji = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSertifikat = new javax.swing.JTable();
        txtDetaljiNaziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetaljiOpis = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lblPoruka = new javax.swing.JLabel();
        btnPrikaziSve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKreiraj.setText("Ubaci");
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

        jLabel1.setText("Naziv:");

        btnPretrazi.setText("Pretraži");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        btnDetalji.setText("Detalji");
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        tblSertifikat.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSertifikat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSertifikatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSertifikat);

        txtDetaljiNaziv.setEditable(false);

        jLabel3.setText("Opis:");

        txtDetaljiOpis.setEditable(false);
        txtDetaljiOpis.setColumns(20);
        txtDetaljiOpis.setRows(5);
        jScrollPane2.setViewportView(txtDetaljiOpis);

        jLabel2.setText("Naziv:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIzađi)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNaziv))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnKreiraj)
                                                .addComponent(txtDetaljiNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPrikaziSve)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDetalji))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPretrazi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnKreiraj)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDetaljiNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDetalji)
                        .addComponent(btnPrikaziSve)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnIzađi)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        try {
            JDialog dialog = new JDialog(this, "Kreiraj sertifikat", true);
            JPanel panel = new FrmAddSertifikat();
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Došlo je do greške prilikom otvaranje forme!" + ex.getMessage(), "Kreiraj sertifikat", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void btnIzađiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzađiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnIzađiActionPerformed

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        try {
            String naziv = txtNaziv.getText().trim();

            List<Sertifikat> sertifikati = Controller.getInstance().pretraziSertifikat(naziv);
            TableModel sertifikatTableModel = new SertifikatTableModel(sertifikati);
            tblSertifikat.setModel(sertifikatTableModel);
            if (sertifikati.isEmpty()) {
                lblPoruka.setText("Sistem ne može da nađe sertifikate po zadatim kriterijumima.");
                return;
            }

            lblPoruka.setText("Sistem je našao sertifikate po zadatim kriterijumima.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
        try{
            if (tblSertifikat.getSelectedRow() != -1) {
                int row = tblSertifikat.getSelectedRow();

                SertifikatTableModel model = (SertifikatTableModel) tblSertifikat.getModel();
                Sertifikat sertifikat = model.getSertifikat(row);
                txtDetaljiNaziv.setText(sertifikat.getNaziv());
                txtDetaljiOpis.setText(sertifikat.getOpis());
                lblPoruka.setText("Sistem je našao sertifikat");
            } else {
                txtDetaljiNaziv.setText("");
                txtDetaljiOpis.setText("");
                lblPoruka.setText("Sistem ne može da nađe sertifikat");
            }
        }catch(Exception e){
            lblPoruka.setText("Sistem ne može da nađe sertifikat");
        }
    }//GEN-LAST:event_btnDetaljiActionPerformed

    private void tblSertifikatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSertifikatMouseClicked

    }//GEN-LAST:event_tblSertifikatMouseClicked

    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed
        fillTableSertifikat();
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
    private javax.swing.JTable tblSertifikat;
    private javax.swing.JTextField txtDetaljiNaziv;
    private javax.swing.JTextArea txtDetaljiOpis;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void fillTableSertifikat() {
    try {
        Controller controller = Controller.getInstance();
        List<Sertifikat> sertifikati = controller.getAllSertifikat();
        
        TableModel sertifikatTableModel = new SertifikatTableModel(sertifikati);
            tblSertifikat.setModel(sertifikatTableModel);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Greška pri učitavanju nivoa fizičke spreme: " + ex.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
    }
}
}
