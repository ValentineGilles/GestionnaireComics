/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AffichageCollection;

import Collec.Comic_Collec;
import User.User;
import Collec.User_serie;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author Alexi
 */
public class UserSeriePanel extends javax.swing.JPanel {
    private User user;
    private User_serie serie;
    private HashSet<ComicPanelCollection> comic_panels; 
    /**
     * Creates new form UserSeriePanel
     */
    public UserSeriePanel(User user,User_serie serie) {
        initComponents();
        this.user=user;
        this.serie=serie;
        this.comic_panels= new HashSet<>();
        InitUserSeriePanelCollection();
    }
    
    public void InitUserSeriePanelCollection(){
        nomSerie.setText(serie.getName());
        contentpageserie.setLayout(new GridLayout(1,6));
        
        
        for (Comic_Collec comic : serie.getUserSerie()) {//MOdifier pour avoir la serie possédée
            comic_panels.add(new ComicPanelCollection(this.user,comic));
        }
        Iterator<ComicPanelCollection> iterator = comic_panels.iterator();
        
        for (int i = 0; i < 6; i++) {
            if (iterator.hasNext()) {
                contentpageserie.add(iterator.next());
            }      
        }
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        afficherGauche = new javax.swing.JButton();
        afficherDroite = new javax.swing.JButton();
        nomSerie = new javax.swing.JLabel();
        contentpageserie = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(1030, 32767));
        setPreferredSize(new java.awt.Dimension(1030, 146));

        afficherGauche.setBackground(new java.awt.Color(153, 153, 153));
        afficherGauche.setForeground(new java.awt.Color(255, 255, 255));
        afficherGauche.setText("<");
        afficherGauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherGaucheActionPerformed(evt);
            }
        });

        afficherDroite.setBackground(new java.awt.Color(153, 153, 153));
        afficherDroite.setForeground(new java.awt.Color(255, 255, 255));
        afficherDroite.setText(">");
        afficherDroite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherDroiteActionPerformed(evt);
            }
        });

        nomSerie.setBackground(new java.awt.Color(51, 51, 51));
        nomSerie.setForeground(new java.awt.Color(255, 255, 255));
        nomSerie.setText("NomSerie");

        contentpageserie.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout contentpageserieLayout = new javax.swing.GroupLayout(contentpageserie);
        contentpageserie.setLayout(contentpageserieLayout);
        contentpageserieLayout.setHorizontalGroup(
            contentpageserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        contentpageserieLayout.setVerticalGroup(
            contentpageserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(afficherGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentpageserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(afficherDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nomSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(afficherDroite, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(afficherGauche, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(contentpageserie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void afficherGaucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherGaucheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_afficherGaucheActionPerformed

    private void afficherDroiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherDroiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_afficherDroiteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficherDroite;
    private javax.swing.JButton afficherGauche;
    private javax.swing.JPanel contentpageserie;
    private javax.swing.JLabel nomSerie;
    // End of variables declaration//GEN-END:variables
}
