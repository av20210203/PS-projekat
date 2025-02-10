/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import domain.EvidencijaTreninga;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logic.Controller;

/**
 *
 * @author Aleksa
 */
public class FrmEvidencijaTreninga extends javax.swing.JFrame {

    /**
     * Creates new form FrmEvidencijaTreninga
     */
    public FrmEvidencijaTreninga() {
        initComponents();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnKreiraj)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIzađi)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnKreiraj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(btnIzađi)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        try {
            EvidencijaTreninga ev = new EvidencijaTreninga();
            JDialog dialog = new JDialog(this, "Kreiraj evidenciju treninga", true);
            JPanel panel = new FrmAddEvidencijaTreninga(ev);
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            Controller controller = Controller.getInstance();
            controller.createEvidencijaTreninga(ev);
            JOptionPane.showMessageDialog(this, "Sistem je kreirao evidenciju treninga!", "Kreiraj evidenciju treninga", JOptionPane.INFORMATION_MESSAGE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne može da kreira evidenciju treninga!" + ex.getMessage(), "Kreiraj evidenciju treninga", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void btnIzađiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzađiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnIzađiActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzađi;
    private javax.swing.JButton btnKreiraj;
    // End of variables declaration//GEN-END:variables
}
