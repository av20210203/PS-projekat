/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import domain.Trener;
import java.lang.System.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aleksa
 */
public class FrmMain extends javax.swing.JFrame {
    
    private Trener trener;
    /**
     * Creates new form FrmMain
     */
    
    public FrmMain(Trener trener) {
        this.trener = trener;
        initComponents();
        setTitle("ProSoft app :: " + trener.getIme() + " " + trener.getPrezime());
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOdjavi = new javax.swing.JButton();
        btnIzadji = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMeni = new javax.swing.JMenu();
        itemKlijent = new javax.swing.JMenuItem();
        itemSertifikat = new javax.swing.JMenuItem();
        itemNivoFizickeSpreme = new javax.swing.JMenuItem();
        itemTermin = new javax.swing.JMenuItem();
        itemTrener = new javax.swing.JMenuItem();
        itemEvidencijaTreninga = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOdjavi.setText("Odjavi se");
        btnOdjavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjaviActionPerformed(evt);
            }
        });

        btnIzadji.setText("Izađi");
        btnIzadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzadjiActionPerformed(evt);
            }
        });

        menuMeni.setText("Meni");
        menuMeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMeniActionPerformed(evt);
            }
        });

        itemKlijent.setText("Klijent");
        itemKlijent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKlijentActionPerformed(evt);
            }
        });
        menuMeni.add(itemKlijent);

        itemSertifikat.setText("Sertifikat");
        itemSertifikat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSertifikatActionPerformed(evt);
            }
        });
        menuMeni.add(itemSertifikat);

        itemNivoFizickeSpreme.setText("Nivo fizičke spreme");
        itemNivoFizickeSpreme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNivoFizickeSpremeActionPerformed(evt);
            }
        });
        menuMeni.add(itemNivoFizickeSpreme);

        itemTermin.setText("Termin");
        itemTermin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTerminActionPerformed(evt);
            }
        });
        menuMeni.add(itemTermin);

        itemTrener.setText("Trener");
        itemTrener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTrenerActionPerformed(evt);
            }
        });
        menuMeni.add(itemTrener);

        itemEvidencijaTreninga.setText("Evidencija treninga");
        itemEvidencijaTreninga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEvidencijaTreningaActionPerformed(evt);
            }
        });
        menuMeni.add(itemEvidencijaTreninga);

        jMenuBar1.add(menuMeni);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(523, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOdjavi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIzadji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(btnIzadji)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOdjavi)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOdjaviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjaviActionPerformed
       this.dispose();
        JDialog dialog=new JDialog((JFrame)null, "Login", true);
        JPanel panel=new FrmLogin();
        dialog.add(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_btnOdjaviActionPerformed

    private void btnIzadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzadjiActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzadjiActionPerformed

    private void itemKlijentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKlijentActionPerformed
        try {
            
            JFrame frame = new FrmKlijent();
            
            frame.setLocationRelativeTo(this);
            frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Klijent");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Došlo je do greške prilikom otvaranje forme!" + ex.getMessage(), "Klijent", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemKlijentActionPerformed

    private void menuMeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMeniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMeniActionPerformed

    private void itemSertifikatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSertifikatActionPerformed
        try {
            
            JFrame frame = new FrmSertifikat();
            
            frame.setLocationRelativeTo(this);
            frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Sertifikat");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Došlo je do greške prilikom otvaranje forme!" + ex.getMessage(), "Sertifikat", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemSertifikatActionPerformed

    private void itemNivoFizickeSpremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNivoFizickeSpremeActionPerformed
        try {
            
            JFrame frame = new FrmNivoFizickeSpreme();
            
            frame.setLocationRelativeTo(this);
            frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Nivo fizičke spreme");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Došlo je do greške prilikom otvaranje forme!" + ex.getMessage(), "Nivo fizičke spreme", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemNivoFizickeSpremeActionPerformed

    private void itemTerminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTerminActionPerformed
        try {
            
            JFrame frame = new FrmTermin();
            
            frame.setLocationRelativeTo(this);
            frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Termin");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Došlo je do greške prilikom otvaranje forme!" + ex.getMessage(), "Termin", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemTerminActionPerformed

    private void itemTrenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTrenerActionPerformed
        try {
            
            JFrame frame = new FrmTrener();
            
            frame.setLocationRelativeTo(this);
            frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Trener");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Došlo je do greške prilikom otvaranje forme!" + ex.getMessage(), "Trener", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemTrenerActionPerformed

    private void itemEvidencijaTreningaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEvidencijaTreningaActionPerformed
        try {
            
            JFrame frame = new FrmEvidencijaTreninga();
            
            frame.setLocationRelativeTo(this);
            frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Evidencija treninga");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Došlo je do greške prilikom otvaranje forme!" + ex.getMessage(), "Evidencija treninga", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemEvidencijaTreningaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzadji;
    private javax.swing.JButton btnOdjavi;
    private javax.swing.JMenuItem itemEvidencijaTreninga;
    private javax.swing.JMenuItem itemKlijent;
    private javax.swing.JMenuItem itemNivoFizickeSpreme;
    private javax.swing.JMenuItem itemSertifikat;
    private javax.swing.JMenuItem itemTermin;
    private javax.swing.JMenuItem itemTrener;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuMeni;
    // End of variables declaration//GEN-END:variables
}
