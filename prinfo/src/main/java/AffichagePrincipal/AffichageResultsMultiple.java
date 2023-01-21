/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AffichagePrincipal;

import API.Comic;
import API.Results;
import API.api_connection;
import AffichageDetail.AffichageDetailPersonnage;
import AffichageDetail.AffichageDetailsComic;
import AffichageDetail.AffichageDetailsSerie;
import GestionUser.User;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Jujubaca
 */
public class AffichageResultsMultiple extends javax.swing.JPanel {

    private Results resultat;
    FenetrePrincipale frame;
    /**
     * Creates new form AffichageResultsMultiple
     */
    public AffichageResultsMultiple(Results res, FenetrePrincipale f) {
        this.frame=f;
        resultat=res;
        initComponents();
        RemplirChamps();
        if (("issue".equals(type.getText())) && (frame.getestCo())){
            jCheckBox1.setVisible(true);
            Comic test_possession= frame.getUser().getCollection().searchComic(res.getId());

            if (test_possession!=null) {
                jCheckBox1.setSelected(true);
            }
            else {
                jCheckBox1.setSelected(false);
            }
        }
        else{
            jCheckBox1.setVisible(false);
        }
    }

    private void RemplirChamps(){
        titre.setText(resultat.getName());
        type.setText(resultat.getType());

        ImageIcon img1=null;
        try{
            BufferedImage img= ImageIO.read(new URL(resultat.getIconLink()));
            int newWidth=100;
            if(img.getWidth()==0){
                img=ImageIO.read(new File("AffichagePrincipal/src/main/resources/image_comic_default.png"));
            }
            float aspectRatio=(float)img.getWidth(null)/img.getHeight(null);
            int newHeight=(int)(newWidth*aspectRatio);
            Image dimg=img.getScaledInstance(newWidth,newHeight,Image.SCALE_SMOOTH);
            img1=new ImageIcon(dimg);

        }catch(IOException ex){
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE,null,ex);
        }
        iconLink.setIcon(img1);

    }

    public javax.swing.JPanel getPanel(){
        return this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLink = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titre = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(51, 51, 51));

        iconLink.setBackground(new java.awt.Color(51, 51, 51));
        iconLink.setForeground(new java.awt.Color(255, 255, 255));
        iconLink.setPreferredSize(new java.awt.Dimension(100, 98));
        iconLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        titre.setBackground(new java.awt.Color(51, 51, 51));
        titre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setText("titre1");

        type.setBackground(new java.awt.Color(51, 51, 51));
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("type1");

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Ajouter");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titre)
                                        .addComponent(type)
                                        .addComponent(jCheckBox1))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titre)
                                .addGap(3, 3, 3)
                                .addComponent(type)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(iconLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iconLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkMouseClicked
        if (evt.getClickCount() == 2 && evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            api_connection apiConnection = new api_connection();
            try {
                switch (resultat.getType()){
                    case "character":
                        AffichageDetailPersonnage affichageDetailPersonnage=
                                new AffichageDetailPersonnage(apiConnection.getCharacter(resultat.getId()));
                        affichageDetailPersonnage.setVisible(true);
                        break;
                    case "issue":
                        AffichageDetailsComic affichageDetailsComic =
                                new AffichageDetailsComic(apiConnection.getComic(resultat.getId()));
                        affichageDetailsComic.setVisible(true);
                        break;
                    case "volume":
                        AffichageDetailsSerie affichageDetailsSerie =
                                new AffichageDetailsSerie(apiConnection.getSerie(resultat.getId()));
                        affichageDetailsSerie.setVisible(true);
                        break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }//GEN-LAST:event_iconLinkMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox1.isSelected()){
            //Pas dans la collection, on doit l'ajouter
            api_connection conn= new api_connection();
            Comic comicSelected;
            try {
                comicSelected = conn.getComic(resultat.getId());
                frame.getUser().changeUserComicStatus(comicSelected, 1);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else {
            //Deja dans la collection, on doit le supprimer
            User user=frame.getUser();
            Comic comicSelected =user.getCollection().searchComic(resultat.getId());//recup du comic
            user.changeUserComicStatus(comicSelected, 0);
        }
        //TODO else remove comic non selected

    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLink;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titre;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
