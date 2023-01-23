/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AffichageDetail;

import AffichagePrincipal.FenetrePrincipale;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cyril
 */
public class AffichageDetailPersonnage extends javax.swing.JFrame {

    /**
     * Creates new form AffichageDetailPersonnage
     */
    public AffichageDetailPersonnage(API.Character c) throws IOException {
        initComponents();
        Name.setText(c.getName());
        if(!Objects.equals(c.getRealName(), "null")){
            Real_Name.setText("("+c.getRealName()+")");
        }
        Nb_Apparitions.setText("Est apparu dans "+c.getComicAppearances()+" comics.");
        HTMLDescription.setText("<html>"+c.getHTMLDescription()+"</html>");
        ImageIcon img1 = null;
        try {
            BufferedImage img = ImageIO.read(new URL(c.getBigIconLink()));
            int newWidth = Icon.getWidth();
            float aspectRatio = (float)img.getHeight(null)/img.getWidth(null);
            int newHeight = (int)(newWidth * aspectRatio);
            Image dimg = img.getScaledInstance(newWidth, newHeight ,Image.SCALE_SMOOTH);
            img1 = new ImageIcon(dimg);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        Icon.setIcon(img1);
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
        Entete = new javax.swing.JSplitPane();
        Informations = new javax.swing.JSplitPane();
        Real_Name = new javax.swing.JLabel();
        Nb_Apparitions = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        HTMLDescription = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 249, 176));
        setSize(new java.awt.Dimension(1032, 600));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        Entete.setBackground(new java.awt.Color(0, 0, 0));
        Entete.setDividerLocation(80);
        Entete.setDividerSize(0);
        Entete.setForeground(new java.awt.Color(255, 255, 255));
        Entete.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        Informations.setBackground(new java.awt.Color(0, 0, 0));
        Informations.setDividerLocation(50);
        Informations.setDividerSize(0);
        Informations.setForeground(new java.awt.Color(0, 0, 0));
        Informations.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        Real_Name.setBackground(new java.awt.Color(0, 0, 0));
        Real_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Real_Name.setForeground(new java.awt.Color(255, 255, 255));
        Informations.setTopComponent(Real_Name);
        Real_Name.getAccessibleContext().setAccessibleName("Real_Name");

        Nb_Apparitions.setBackground(new java.awt.Color(0, 0, 0));
        Nb_Apparitions.setForeground(new java.awt.Color(255, 255, 255));
        Nb_Apparitions.setText("est apparu dans XX Comics");
        Informations.setRightComponent(Nb_Apparitions);

        Entete.setRightComponent(Informations);

        Name.setBackground(new java.awt.Color(0, 0, 0));
        Name.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");
        Entete.setLeftComponent(Name);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(959, 568));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        HTMLDescription.setBackground(new java.awt.Color(51, 51, 51));
        HTMLDescription.setForeground(new java.awt.Color(255, 255, 255));
        HTMLDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HTMLDescription.setText("HTML description");
        HTMLDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        HTMLDescription.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        HTMLDescription.setPreferredSize(new java.awt.Dimension(37, 16));
        HTMLDescription.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HTMLDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(HTMLDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        Icon.setBackground(new java.awt.Color(0, 0, 0));
        Icon.setForeground(new java.awt.Color(255, 255, 255));
        Icon.setMaximumSize(new java.awt.Dimension(180, 500));
        Icon.setMinimumSize(new java.awt.Dimension(180, 500));
        Icon.setPreferredSize(new java.awt.Dimension(180, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entete, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Entete, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(AffichageDetailPersonnage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AffichageDetailPersonnage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AffichageDetailPersonnage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AffichageDetailPersonnage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane Entete;
    private javax.swing.JLabel HTMLDescription;
    private javax.swing.JLabel Icon;
    private javax.swing.JSplitPane Informations;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Nb_Apparitions;
    private javax.swing.JLabel Real_Name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
