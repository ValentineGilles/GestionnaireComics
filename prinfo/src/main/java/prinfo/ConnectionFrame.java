/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prinfo;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

/**
 *
 * @author Jujubaca
 */
public class ConnectionFrame extends javax.swing.JFrame {
    FenetrePrincipale frame;
    String login;
    
    public String getlogin(){
        return login;
    }

    /**
     * Creates new form ConnectionFrame
     */
    public ConnectionFrame() {
        initComponents();
        //ImageIcon fermerFenetreImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconFermerFenetre.png")));
        //Image fermerFenetreImage = fermerFenetreImageIcon.getImage().getScaledInstance(fermeFenetreBouton.getWidth(), fermeFenetreBouton.getHeight(), WIDTH);
        //fermeFenetreBouton.setIcon(new ImageIcon(fermerFenetreImage));
    }
    public ConnectionFrame(FenetrePrincipale f) {
        initComponents();
        //ImageIcon fermerFenetreImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconFermerFenetre.png")));
        //Image fermerFenetreImage = fermerFenetreImageIcon.getImage().getScaledInstance(fermeFenetreBouton.getWidth(), fermeFenetreBouton.getHeight(), WIDTH);
        //fermeFenetreBouton.setIcon(new ImageIcon(fermerFenetreImage));
        frame = f;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ConnexionBouton = new javax.swing.JButton();
        CreationCompteBouton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fermeFenetreBouton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        EtatConnection = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Connection");
        setBackground(new java.awt.Color(255, 249, 176));
        setMinimumSize(new java.awt.Dimension(750, 380));
        setPreferredSize(new java.awt.Dimension(750, 380));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 380));

        jPanel1.setBackground(new java.awt.Color(255, 249, 176));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 350));

        ConnexionBouton.setBackground(java.awt.Color.lightGray);
        ConnexionBouton.setText("Connexion");
        ConnexionBouton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConnexionBoutonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConnexionBoutonMouseExited(evt);
            }
        });
        ConnexionBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnexionBoutonActionPerformed(evt);
            }
        });

        CreationCompteBouton.setBackground(java.awt.Color.lightGray);
        CreationCompteBouton.setText("Créer un compte");
        CreationCompteBouton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreationCompteBoutonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreationCompteBoutonMouseExited(evt);
            }
        });
        CreationCompteBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreationCompteBoutonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("<html>Connectez-vous</html>");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("<html>Vous n'avez pas <br> encore de compte ?</html>");

        fermeFenetreBouton.setBackground(new java.awt.Color(166, 172, 175));
        fermeFenetreBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermeFenetreBoutonActionPerformed(evt);
            }
        });

        jLabel1.setText("Mot de passe oublié ?");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Utilisateur ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mot de passe ");

        EtatConnection.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        EtatConnection.setForeground(new java.awt.Color(255, 51, 51));
        EtatConnection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConnexionBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 45, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(EtatConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CreationCompteBouton)
                                .addGap(161, 161, 161))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(fermeFenetreBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fermeFenetreBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(CreationCompteBouton)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1))
                        .addGap(18, 18, 18)
                        .addComponent(EtatConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(ConnexionBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnexionBoutonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnexionBoutonMouseEntered
        ConnexionBouton.setBackground(Color.darkGray);
    }//GEN-LAST:event_ConnexionBoutonMouseEntered

    private void ConnexionBoutonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnexionBoutonMouseExited
        ConnexionBouton.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ConnexionBoutonMouseExited

    private void CreationCompteBoutonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreationCompteBoutonMouseEntered
        CreationCompteBouton.setBackground(Color.darkGray);
    }//GEN-LAST:event_CreationCompteBoutonMouseEntered

    private void CreationCompteBoutonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreationCompteBoutonMouseExited
        CreationCompteBouton.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_CreationCompteBoutonMouseExited

    private void CreationCompteBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreationCompteBoutonActionPerformed
        CreationCompteFrame creationCompte = new CreationCompteFrame();
        creationCompte.setLocationRelativeTo(null);
        creationCompte.setVisible(true);
    }//GEN-LAST:event_CreationCompteBoutonActionPerformed

    private void fermeFenetreBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermeFenetreBoutonActionPerformed
        this.dispose();
    }//GEN-LAST:event_fermeFenetreBoutonActionPerformed

    private void ConnexionBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnexionBoutonActionPerformed
        String logintemp = jTextField1.getText();
        String mdp = jPasswordField1.getText();
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prinfo7", "prinfo", "prinfo");
        Statement stmt = con.createStatement();
        if(argon2.verify(bdd.lecture(stmt, logintemp), mdp)){
            login = logintemp;
            frame.switchestCo();
            this.dispose();
        }
        else
        {
            EtatConnection.setText("Mauvais MDP Ou Login inexistant");
        }
        }
        catch(Exception e){
            System.out.println("Problème de connection a la bdd");
        }
        
    }//GEN-LAST:event_ConnexionBoutonActionPerformed

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
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectionFrame().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConnexionBouton;
    private javax.swing.JButton CreationCompteBouton;
    private javax.swing.JLabel EtatConnection;
    private javax.swing.JButton fermeFenetreBouton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
