/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AffichageCompte;

import AffichagePrincipal.FenetrePrincipale;
import FileManagner.DBconfig;
import GestionUser.User_BDD;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author Nathan
 */
public class ChangeMdp1 extends javax.swing.JFrame {
    FenetrePrincipale main;

    /**
     * Creates new form ChangeMdp
     */
    public ChangeMdp1() {
        initComponents();
    }
    public ChangeMdp1(FenetrePrincipale a) {
        
        
        initComponents();
        main = a;
        Username.setText(a.getUser().getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	String sImageFileName = "../icon.png";
        URL urlImageFileName = getClass().getResource(sImageFileName);

        if (urlImageFileName == null)
            System.out.println( "urlImageFileName: " + urlImageFileName + " Not Found." );
        else {
            ImageIcon oImageIcon = new ImageIcon(getClass().getResource(sImageFileName));
            setIconImage(oImageIcon.getImage());
        }  // end else
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        soumettreButton = new javax.swing.JButton();
        Info = new javax.swing.JLabel();
        NewMDP = new javax.swing.JPasswordField();
        ConfMDP = new javax.swing.JPasswordField();
        AncienMdp = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Changement de mot de passe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ancien mot de passe");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nouveau mot de passe");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmation du mot de passe");

        Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("Username");
        Username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        soumettreButton.setText("Soumettre");
        soumettreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soumettreButtonActionPerformed(evt);
            }
        });

        ConfMDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfMDPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NewMDP)
                    .addComponent(soumettreButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(ConfMDP)
                    .addComponent(AncienMdp))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AncienMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NewMDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ConfMDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soumettreButton)
                    .addComponent(Info))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soumettreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soumettreButtonActionPerformed
        // TODO add your handling code here:
        char[] OldMDP = AncienMdp.getPassword();
        char[] newMDP = NewMDP.getPassword();
        char[] Conf = ConfMDP.getPassword();
        ConfMDP.setBackground(Color.white);
        AncienMdp.setBackground(Color.white);
        Info.setText("");
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        try (Connection con = DriverManager.getConnection(DBconfig.getUrl(), DBconfig.getUsername(), DBconfig.getPassword())){
        Statement stmt = con.createStatement();
        if(argon2.verify(User_BDD.lectureMdp(stmt, main.getUser().getUsername()), OldMDP)){
        	boolean check_password=true;
            if (newMDP.length==Conf.length) {
            	for (int i = 0; i < Conf.length; i++) {
            		char c1 = newMDP[i];
        			char c2 = Conf[i];
        			if (c1!=c2) {
    					check_password=false;
    				}
        		}
    		}
            else {
    			check_password=false;
    		}
        	
            if(check_password){
                System.out.println("Je CHANGE LE MDP");
                
                main.getUser().changePassword(stmt,newMDP);
                Info.setForeground(Color.green);
                Info.setText("Mot de passe changé avec succès");
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Votre Mot de passe a été changé avec succès");
                this.dispose();
            }
            else{
                Info.setText("Les mots de passes sont différents");
                Info.setForeground(Color.red);
                ConfMDP.setBackground(Color.red);
               
            }
        }
        else
        {
            Info.setText("Mauvais mot de passe");
            Info.setForeground(Color.red);
            AncienMdp.setBackground(Color.red);
        }
        }
        catch(Exception e){
            System.out.println("Problème de connection a la bdd");
        }
        
    }//GEN-LAST:event_soumettreButtonActionPerformed

    private void ConfMDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfMDPActionPerformed
        // TODO add your handling code here:
        soumettreButtonActionPerformed(evt);
        
    }//GEN-LAST:event_ConfMDPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeMdp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeMdp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeMdp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeMdp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeMdp1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AncienMdp;
    private javax.swing.JPasswordField ConfMDP;
    private javax.swing.JLabel Info;
    private javax.swing.JPasswordField NewMDP;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton soumettreButton;
    // End of variables declaration//GEN-END:variables
}
