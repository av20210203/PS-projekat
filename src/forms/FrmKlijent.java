/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import components.KlijentTableModel;
import components.TerminTableModel;
import domain.Klijent;
import domain.NivoFizickeSpreme;
import domain.Termin;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import logic.Controller;

/**
 *
 * @author Aleksa
 */
public class FrmKlijent extends javax.swing.JFrame {

    /**
     * Creates new form FrmKlijent
     */
    public FrmKlijent() throws SQLException {
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
        cmbNivo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKlijent = new javax.swing.JTable();
        lblPoruka = new javax.swing.JLabel();
        btnPretrazi = new javax.swing.JButton();
        btnPrikaziSve = new javax.swing.JButton();
        btnDetalji = new javax.swing.JButton();
        txtDetaljiIme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDetaljiPrezime = new javax.swing.JTextField();
        txtDetaljiEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDetaljiNivo = new javax.swing.JTextField();
        btnResett = new javax.swing.JButton();

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

        jLabel1.setText("Nivo fizičke spreme:");

        jLabel2.setText("Ime:");

        jLabel3.setText("Prezime:");

        tblKlijent.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblKlijent);

        btnPretrazi.setText("Pretraži");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        btnPrikaziSve.setText("Prikaži sve");
        btnPrikaziSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveActionPerformed(evt);
            }
        });

        btnDetalji.setText("Detalji");
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        txtDetaljiIme.setEditable(false);

        jLabel4.setText("Ime:");

        jLabel5.setText("Prezime:");

        txtDetaljiPrezime.setEditable(false);

        txtDetaljiEmail.setEditable(false);

        jLabel6.setText("Email:");

        jLabel7.setText("Nivo fizičke spreme:");

        txtDetaljiNivo.setEditable(false);

        btnResett.setText("Resetuj");
        btnResett.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResettActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDetaljiNivo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKreiraj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(cmbNivo, 0, 175, Short.MAX_VALUE)
                            .addComponent(txtPrezime)
                            .addComponent(txtIme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnResett)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDetaljiEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDetaljiIme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDetaljiPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrikaziSve)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetalji)
                    .addComponent(btnIzađi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnKreiraj)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbNivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(btnResett))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDetaljiIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtDetaljiPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)
                                .addComponent(btnPretrazi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDetaljiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDetaljiNivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDetalji)
                        .addComponent(btnPrikaziSve)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzađi))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzađiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzađiActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_btnIzađiActionPerformed

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        try {
            Klijent klijent = new Klijent();
            JDialog dialog = new JDialog(this, "Kreiraj klijenta", true);
            JPanel panel = new FrmAddKlijent(klijent);
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            Controller controller = Controller.getInstance();
            controller.createKlijent(klijent);
            JOptionPane.showMessageDialog(this, "Sistem je kreirao klijenta!", "Kreiraj klijenta", JOptionPane.INFORMATION_MESSAGE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Sistem ne može da kreira klijenta!", "Kreiraj klijenta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed

        try {
            if(cmbNivo.getSelectedIndex()!=-1&&!(txtIme.getText().trim().equals(""))&&txtPrezime.getText().trim().equals("")){
                NivoFizickeSpreme nivo = (NivoFizickeSpreme) cmbNivo.getSelectedItem();
                String ime = txtIme.getText().trim();
                List<Klijent> klijenti = Controller.getInstance().pretraziKlijent(nivo,ime);
                List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
                TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
                tblKlijent.setModel(klijentTableModel);
                if (klijenti.isEmpty()) {
                    lblPoruka.setText("Sistem ne može da nađe klijente po zadatim kriterijumima.");
                    return;
                }

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
                return;
            }
            
            if(cmbNivo.getSelectedIndex()!=-1&&!(txtPrezime.getText().trim().equals(""))&&txtIme.getText().trim().equals("")){
                NivoFizickeSpreme nivo = (NivoFizickeSpreme) cmbNivo.getSelectedItem();
                String prezime = txtPrezime.getText().trim();
                List<Klijent> klijenti = Controller.getInstance().pretraziKlijentP(nivo,prezime);
List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
                TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
                tblKlijent.setModel(klijentTableModel);
                if (klijenti.isEmpty()) {
                    lblPoruka.setText("Sistem ne može da nađe klijente po zadatim kriterijumima.");
                    return;
                }

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
                return;
            }
            if(cmbNivo.getSelectedIndex()==-1&&(!txtPrezime.getText().trim().equals(""))&&(!txtIme.getText().trim().equals(""))){
                String ime = txtIme.getText().trim();
                String prezime = txtPrezime.getText().trim();
                List<Klijent> klijenti = Controller.getInstance().pretraziKlijent(ime,prezime);

                List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
                TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
                tblKlijent.setModel(klijentTableModel);
                if (klijenti.isEmpty()) {
                    lblPoruka.setText("Sistem ne može da nađe klijente po zadatim kriterijumima.");
                    return;
                }

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
                return;
            }
            if(cmbNivo.getSelectedIndex()!=-1&&(txtPrezime.getText().trim().equals(""))&&(txtIme.getText().trim().equals(""))){
                NivoFizickeSpreme nivo = (NivoFizickeSpreme) cmbNivo.getSelectedItem();
                List<Klijent> klijenti = Controller.getInstance().pretraziKlijent(nivo);
                List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
                TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
                tblKlijent.setModel(klijentTableModel);
                if (klijenti.isEmpty()) {
                    lblPoruka.setText("Sistem ne može da nađe klijente po zadatim kriterijumima.");
                    return;
                }

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
                return;
            }
            if(cmbNivo.getSelectedIndex()==-1&&(txtPrezime.getText().trim().equals(""))&&(!txtIme.getText().trim().equals(""))){
                String ime = txtIme.getText().trim();
                List<Klijent> klijenti = Controller.getInstance().pretraziKlijent(ime);
                List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
                TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
                tblKlijent.setModel(klijentTableModel);
                if (klijenti.isEmpty()) {
                    lblPoruka.setText("Sistem ne može da nađe klijente po zadatim kriterijumima.");
                    return;
                }

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
                return;
            }
             if(cmbNivo.getSelectedIndex()==-1&&(!txtPrezime.getText().trim().equals(""))&&(txtIme.getText().trim().equals(""))){
                String prezime = txtPrezime.getText().trim();
                List<Klijent> klijenti = Controller.getInstance().pretraziKlijentP(prezime);
                List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
                TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
                tblKlijent.setModel(klijentTableModel);
                if (klijenti.isEmpty()) {
                    lblPoruka.setText("Sistem ne može da nađe klijente po zadatim kriterijumima.");
                    return;
                }

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
                return;
            }
             if(cmbNivo.getSelectedIndex()==-1&&(txtPrezime.getText().trim().equals(""))&&(txtIme.getText().trim().equals(""))){
                fillTableKlijent();
                

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
                return;
            }
             NivoFizickeSpreme nivo = (NivoFizickeSpreme) cmbNivo.getSelectedItem();
             String ime = txtIme.getText().trim();
                String prezime = txtPrezime.getText().trim();
             List<Klijent> klijenti = Controller.getInstance().pretraziKlijent(nivo,ime,prezime);
                List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
                TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
                tblKlijent.setModel(klijentTableModel);
                if (klijenti.isEmpty()) {
                    lblPoruka.setText("Sistem ne može da nađe klijente po zadatim kriterijumima.");
                    return;
                }

                lblPoruka.setText("Sistem je našao klijente po zadatim kriterijumima.");
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed
        fillTableKlijent();
    }//GEN-LAST:event_btnPrikaziSveActionPerformed

    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
      try{
            if (tblKlijent.getSelectedRow() != -1) {
                int row = tblKlijent.getSelectedRow();

                KlijentTableModel model = (KlijentTableModel) tblKlijent.getModel();
                Klijent klijent = model.getKlijent(row);
                txtDetaljiIme.setText(klijent.getIme());
                txtDetaljiPrezime.setText(klijent.getPrezime());
                txtDetaljiEmail.setText(klijent.getEmail());
                txtDetaljiNivo.setText(klijent.getNivoFizickeSpreme().getNivo());
                lblPoruka.setText("Sistem je našao klijenta");
            } else {
                txtDetaljiEmail.setText("");
                txtDetaljiIme.setText("");
                txtDetaljiPrezime.setText("");
                txtDetaljiNivo.setText("");
                lblPoruka.setText("Sistem ne može da nađe klijenta");
            }
        }catch(Exception e){
            lblPoruka.setText("Sistem ne može da nađe klijenta");
        }
    }//GEN-LAST:event_btnDetaljiActionPerformed

    private void btnResettActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResettActionPerformed
       cmbNivo.setSelectedIndex(-1);
    }//GEN-LAST:event_btnResettActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalji;
    private javax.swing.JButton btnIzađi;
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnPrikaziSve;
    private javax.swing.JButton btnResett;
    private javax.swing.JComboBox<NivoFizickeSpreme> cmbNivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JTable tblKlijent;
    private javax.swing.JTextField txtDetaljiEmail;
    private javax.swing.JTextField txtDetaljiIme;
    private javax.swing.JTextField txtDetaljiNivo;
    private javax.swing.JTextField txtDetaljiPrezime;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void prepareView() throws SQLException {
        initComponents();
        fillCmbNivo();
        tblKlijent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void fillCmbNivo() throws SQLException {
        Controller controller = Controller.getInstance();
        List<NivoFizickeSpreme> nivoi = controller.getAllNivo();
        List<NivoFizickeSpreme> filtriraniNivoi = nivoi.stream()
    .filter(nivo -> !(nivo.getIdNivoFizickeSpreme() == 12 || nivo.getNivo().equals("")))
    .collect(Collectors.toList());

        
        for(NivoFizickeSpreme nivo : filtriraniNivoi){
        cmbNivo.addItem(nivo);
        }
        cmbNivo.setSelectedIndex(-1);
    }

    private void fillTableKlijent() {
        try {
      
        Controller controller = Controller.getInstance();
        List<Klijent> klijenti = controller.getAllKlijent();
        List<Klijent> filtriraniKlijenti = klijenti.stream()
    .filter(klijent -> !klijent.getIme().equals("Nepoznato"))
    .collect(Collectors.toList());
        
        
        TableModel klijentTableModel = new KlijentTableModel(filtriraniKlijenti);
            tblKlijent.setModel(klijentTableModel);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Greška pri učitavanju termina: " + ex.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
    }
    }
}
