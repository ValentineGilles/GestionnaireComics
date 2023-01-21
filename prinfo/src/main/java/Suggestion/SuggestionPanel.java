/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package Suggestion;

import API.Comic;
import API.Results;
import API.api_connection;
import User.User;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import prinfo.AffichageDetailsComic;
import prinfo.FenetrePrincipale;

/**
 *
 * @author Sarah-Marie JULES
 */
public class SuggestionPanel extends javax.swing.JPanel {
    private FenetrePrincipale frame;
    private Comic comic;
    /** Creates new form SuggestionPanel
     * @param frame
     * @param comic */
    public SuggestionPanel(FenetrePrincipale f, Comic com) {
        this.frame = f;
        comic = com;
        initComponents();
        //jCheckBox1.setVisible(frame.getestCo());
        RemplirChamps(comic);
        System.out.println(frame.getestCo());
        if ((frame.getestCo())){
            jCheckBox1.setVisible(true);
            Comic test_possession= frame.getUser().getCollection().searchComic(comic.getId());
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
        System.out.println("ok2");
    }
    
    private void RemplirChamps(Comic comic){
        titre.setText(comic.getName());
        ImageIcon img1 = null;
        try{
            BufferedImage img= ImageIO.read(new URL(comic.getIconLink()));
            int newWidth=100;
            if(img.getWidth()==0){
                img=ImageIO.read(new File("prinfo/src/main/resources/image_comic_default.png"));
            }
            float aspectRatio=(float)img.getWidth(null)/img.getHeight(null);
            int newHeight=(int)(newWidth*aspectRatio);
            Image dimg=img.getScaledInstance(newWidth,newHeight,Image.SCALE_SMOOTH);
            img1=new ImageIcon(dimg);

        }catch(IOException ex){
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE,null,ex);
        }
        photoComic.setIcon(img1);
        
    }
    
    public javax.swing.JPanel getPanel(){
        return this;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photoComic = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(51, 51, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        photoComic.setText("photo");
        photoComic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photoComicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                photoComicMouseEntered(evt);
            }
        });

        titre.setBackground(new java.awt.Color(51, 51, 51));
        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setText("title11");

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Ajouter");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoComic, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jCheckBox1)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(photoComic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()){
        	//Pas dans la collection, on doit l'ajouter
            api_connection conn= new api_connection();   	
            Comic comicSelected = null;
            try {
                comicSelected = conn.getComic(comic.getId());
            } catch (IOException ex) {
                Logger.getLogger(SuggestionPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.getUser().changeUserComicStatus(comicSelected, 1);
        }else {
        	//Deja dans la collection, on doit le supprimer
            User user=frame.getUser();
            Comic comicSelected =user.getCollection().searchComic(comic.getId());//recup du comic
            user.changeUserComicStatus(comicSelected, 0);
	}
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void photoComicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoComicMouseClicked
        // TODO add your handling code here:
        api_connection apiConnection = new api_connection();
        AffichageDetailsComic affichageDetailsComic = null;
        try {
            affichageDetailsComic = new AffichageDetailsComic(apiConnection.getComic(comic.getId()));
        } catch (IOException ex) {
            Logger.getLogger(SuggestionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        affichageDetailsComic.setVisible(true);
    }//GEN-LAST:event_photoComicMouseClicked

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_formMouseExited

    private void photoComicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoComicMouseEntered
        this.setBackground(Color.darkGray);
    }//GEN-LAST:event_photoComicMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel photoComic;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables

}
