/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prinfo;

import API.Results;
import API.api_connection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Choice;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author nathb
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    private api_connection test;
    private List<Results> ResultatsRecherche;
    ConnectionFrame connectionFrame;


    private List<AffichageResultsMultiple> resultatsMultipleAffichage;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        test = new api_connection();
        resultatsMultipleAffichage = new LinkedList<AffichageResultsMultiple>();
        PanelCollection.setVisible(estCo);
	Choice droplistFiltre=new Choice();
        droplistFiltre.add("Tout");
        droplistFiltre.add("Character");
        droplistFiltre.add("Comics");
        droplistFiltre.setVisible(true);
        scrollPaneAffichageMultiple.setVisible(false);
    }
    /**
     * Boolean true si on est connecté, false sinon
     */
     private boolean estCo = false;

     public boolean getestCo(){
         return estCo;
     }
     public void setestCo(boolean a){
         estCo = a;
     }
     public void switchestCo(){
         estCo = !estCo;
         PanelCollection.setVisible(estCo);
         if (estCo)
            jLabel4.setText(connectionFrame.getlogin());
         else
            jLabel4.setText("Se Connecter"); 
         
     }
     public String getlogin(){
         return connectionFrame.getlogin();
     }
     
	int pageNumber = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entete = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelAccueil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelCollection = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PanelConnection = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rechercheBtn = new javax.swing.JButton();
        dropListFiltre = new javax.swing.JComboBox<>();
        contentPage = new javax.swing.JPanel();
        scrollPaneAffichageMultiple = new java.awt.ScrollPane();
        panelAffichageMultiple = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1032, 600));

        jPanel1.setBackground(new java.awt.Color(255, 249, 176));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 1, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        entete.setBackground(new java.awt.Color(255, 211, 132));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NetComics");

        PanelAccueil.setBackground(new java.awt.Color(255, 211, 132));
        PanelAccueil.setToolTipText("");
        PanelAccueil.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PanelAccueil.setName(""); // NOI18N
        PanelAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelAccueilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelAccueilMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Accueil");
        jLabel2.setName("Acc"); // NOI18N

        javax.swing.GroupLayout PanelAccueilLayout = new javax.swing.GroupLayout(PanelAccueil);
        PanelAccueil.setLayout(PanelAccueilLayout);
        PanelAccueilLayout.setHorizontalGroup(
            PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelAccueilLayout.setVerticalGroup(
            PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelCollection.setBackground(new java.awt.Color(255, 211, 132));
        PanelCollection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCollectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCollectionMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ma Collection");

        javax.swing.GroupLayout PanelCollectionLayout = new javax.swing.GroupLayout(PanelCollection);
        PanelCollection.setLayout(PanelCollectionLayout);
        PanelCollectionLayout.setHorizontalGroup(
            PanelCollectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCollectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCollectionLayout.setVerticalGroup(
            PanelCollectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCollectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField1.setText("Rechercher");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        PanelConnection.setBackground(new java.awt.Color(255, 211, 132));
        PanelConnection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelConnectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelConnectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelConnectionMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Se Connecter");

        javax.swing.GroupLayout PanelConnectionLayout = new javax.swing.GroupLayout(PanelConnection);
        PanelConnection.setLayout(PanelConnectionLayout);
        PanelConnectionLayout.setHorizontalGroup(
            PanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelConnectionLayout.setVerticalGroup(
            PanelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        rechercheBtn.setText("Rechercher");
        rechercheBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercheBtnMouseClicked(evt);
            }
        });
        rechercheBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheBtnActionPerformed(evt);
            }
        });

        dropListFiltre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout", "Personnages", "Séries", "Comic" }));

        javax.swing.GroupLayout enteteLayout = new javax.swing.GroupLayout(entete);
        entete.setLayout(enteteLayout);
        enteteLayout.setHorizontalGroup(
            enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enteteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(PanelAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelCollection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(enteteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enteteLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropListFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rechercheBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(131, Short.MAX_VALUE))))
        );
        enteteLayout.setVerticalGroup(
            enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enteteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(enteteLayout.createSequentialGroup()
                        .addComponent(PanelConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(enteteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PanelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelCollection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(enteteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rechercheBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dropListFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17))))))
        );

        contentPage.setBackground(new java.awt.Color(255, 249, 176));
        contentPage.setPreferredSize(new java.awt.Dimension(1030, 700));

        scrollPaneAffichageMultiple.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelAffichageMultiple.setBackground(new java.awt.Color(255, 249, 176));

        javax.swing.GroupLayout panelAffichageMultipleLayout = new javax.swing.GroupLayout(panelAffichageMultiple);
        panelAffichageMultiple.setLayout(panelAffichageMultipleLayout);
        panelAffichageMultipleLayout.setHorizontalGroup(
            panelAffichageMultipleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        panelAffichageMultipleLayout.setVerticalGroup(
            panelAffichageMultipleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        scrollPaneAffichageMultiple.add(panelAffichageMultiple);

        javax.swing.GroupLayout contentPageLayout = new javax.swing.GroupLayout(contentPage);
        contentPage.setLayout(contentPageLayout);
        contentPageLayout.setHorizontalGroup(
            contentPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAffichageMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentPageLayout.setVerticalGroup(
            contentPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAffichageMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(entete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPage, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void PanelAccueilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAccueilMouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(112, 128, 144));
    }//GEN-LAST:event_PanelAccueilMouseEntered

    private void PanelCollectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCollectionMouseEntered
        // TODO add your handling code here:
       jLabel3.setForeground(new Color(112,128,144));
    }//GEN-LAST:event_PanelCollectionMouseEntered

    private void PanelConnectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelConnectionMouseEntered
        // TODO add your handling code here:
        jLabel4.setForeground(new Color(112,128,144));
    }//GEN-LAST:event_PanelConnectionMouseEntered

    private void PanelAccueilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAccueilMouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_PanelAccueilMouseExited

    private void PanelCollectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCollectionMouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_PanelCollectionMouseExited

    private void PanelConnectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelConnectionMouseExited
        // TODO add your handling code here:
        jLabel4.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_PanelConnectionMouseExited

    private void PanelConnectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelConnectionMouseClicked
        // TODO add your handling code here:
        if(estCo){
            DeconnectionFrame deco = new DeconnectionFrame(this);
            deco.setLocationRelativeTo(null);
            deco.setVisible(true);
   
        }
        else {
        connectionFrame = new ConnectionFrame(this);
        connectionFrame.setLocationRelativeTo(null);
        connectionFrame.setVisible(true);
        }
    }//GEN-LAST:event_PanelConnectionMouseClicked

    private void rechercheBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheBtnActionPerformed
        // On supprime la liste précédemmant cherchée pour la set à nouveau
        if (ResultatsRecherche!=null) {
            ResultatsRecherche.clear();
            resultatsMultipleAffichage.clear();
            panelAffichageMultiple.removeAll();
        }

        try {
            ResultatsRecherche = test.GetResults(jTextField1.getText(), 1,dropListFiltre.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }

        panelAffichageMultiple.setLayout(new GridLayout((int) ResultatsRecherche.size()/2, 2, 5, 5));
        scrollPaneAffichageMultiple.setVisible(true);

        for (Results results : ResultatsRecherche) {
            resultatsMultipleAffichage.add(new AffichageResultsMultiple(results));
        }

        for (AffichageResultsMultiple affichageResultsMultiple : resultatsMultipleAffichage) {
            panelAffichageMultiple.add(affichageResultsMultiple);
        }
        contentPage.updateUI();

        /*for (Results results : ResultatsRecherche) {
            System.out.println(results.getName() + "\n");
            System.out.println(results.getShortDescription() + "\n");
            System.out.println(results.getType() + "\n");
            System.out.println("\n");
        }
        System.out.println(this);
        System.out.println("prinfo.FenetrePrincipale.rechercheBtnActionPerformed()");*/
    }//GEN-LAST:event_rechercheBtnActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void rechercheBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercheBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rechercheBtnMouseClicked

   
    
    /*private void AfficheResultats() {
        if (ResultatsRecherche.size() >= 6) {
            for (int i = 1; i < 7; i++) {
                AffichageSurBonPanel(i, ResultatsRecherche.get(i - 1));
            }
        } else {
            for (int i = 1; i < ResultatsRecherche.size(); i++) {
                AffichageSurBonPanel(i, ResultatsRecherche.get(i));
            
            }
        }
    }

    
    // nbPanel est compris entre 1 et 6 pour différentier sur quel panel on affiche les resultats
    /*private void AffichageSurBonPanel(int nbPanel, Results ResultatRecherche) {
        switch (nbPanel) {
            case 1:
                titre1.setText(ResultatRecherche.getName());
                id1.setText(String.valueOf(ResultatRecherche.getId()));
                description1.setText(ResultatRecherche.getShortDescription());
                type1.setText(ResultatRecherche.getType());
                //iconLink1.setText(ResultatRecherche.getIconLink());     
                ImageIcon img1 = null;
                try {
                    img1 = new ImageIcon(new URL(ResultatRecherche.getIconLink()));
                } catch (MalformedURLException ex) {
                    Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
                iconLink1.setIcon(img1);
                break;
            case 2:
                titre2.setText(ResultatRecherche.getName());
                id2.setText(String.valueOf(ResultatRecherche.getId()));
                description2.setText(ResultatRecherche.getShortDescription());
                type2.setText(ResultatRecherche.getType());
                ImageIcon img2 = null;
            try {
                img2 = new ImageIcon(new URL(ResultatRecherche.getIconLink()));
            } catch (MalformedURLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
                iconLink2.setIcon(img2);
                break;
            case 3:
                titre3.setText(ResultatRecherche.getName());
                id3.setText(String.valueOf(ResultatRecherche.getId()));
                description3.setText(ResultatRecherche.getShortDescription());
                type3.setText(ResultatRecherche.getType());
                ImageIcon img3 = null;
            try {
                img3 = new ImageIcon(new URL(ResultatRecherche.getIconLink()));
            } catch (MalformedURLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
                iconLink3.setIcon(img3);
                break;
            case 4:
                titre4.setText(ResultatRecherche.getName());
                id4.setText(String.valueOf(ResultatRecherche.getId()));
                description4.setText(ResultatRecherche.getShortDescription());
                type4.setText(ResultatRecherche.getType());
                ImageIcon img4 = null;
            try {
                img4 = new ImageIcon(new URL(ResultatRecherche.getIconLink()));
            } catch (MalformedURLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
                iconLink4.setIcon(img4);

                break;
            case 5:
                titre5.setText(ResultatRecherche.getName());
                id5.setText(String.valueOf(ResultatRecherche.getId()));
                description5.setText(ResultatRecherche.getShortDescription());
                type5.setText(ResultatRecherche.getType());
                ImageIcon img5 = null;
            try {
                img5 = new ImageIcon(new URL(ResultatRecherche.getIconLink()));
            } catch (MalformedURLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
                iconLink5.setIcon(img5);

                break;
            case 6:
                titre6.setText(ResultatRecherche.getName());
                id6.setText(String.valueOf(ResultatRecherche.getId()));
                description6.setText(ResultatRecherche.getShortDescription());
                type6.setText(ResultatRecherche.getType());
                ImageIcon img6 = null;
            try {
                img6 = new ImageIcon(new URL(ResultatRecherche.getIconLink()));
            } catch (MalformedURLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
                iconLink6.setIcon(img6);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FenetrePrincipale main = new FenetrePrincipale();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAccueil;
    private javax.swing.JPanel PanelCollection;
    private javax.swing.JPanel PanelConnection;
    private javax.swing.JPanel contentPage;
    private javax.swing.JComboBox<String> dropListFiltre;
    private javax.swing.JPanel entete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panelAffichageMultiple;
    private javax.swing.JButton rechercheBtn;
    private java.awt.ScrollPane scrollPaneAffichageMultiple;
    // End of variables declaration//GEN-END:variables
}
