/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Suggestion;

import API.Comic;
import API.api_connection;
import AffichagePrincipal.FenetrePrincipale;
import Collec.Comic_Collec;
import FileManagner.DBconfig;

import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Sarah-Marie JULES
 * @author alexi
 */
public class Suggestion extends javax.swing.JPanel {
    private api_connection test;
    private FenetrePrincipale frame;
    private List<Comic> firstCategorie;
    private List<Comic> secondCategorie;
    private List<Comic> secondCategorieBis;
    private List<Comic> thirdCategorie;
    /**
     * Creates new form Suggestion
     * @param frame
     * @throws java.io.IOException
     * @throws java.sql.SQLException
     */
    public Suggestion(FenetrePrincipale frame) throws IOException, SQLException {
    	this.frame=frame;
        test = new api_connection();
        initComponents();
        this.generateSuggestion(frame);

        
    }
    /**
	 * Recharche les panels de suggestion apres une connexion/ deconnexion
	 */
    public void reloadSuggPanels() throws IOException {
    	contentSuggestion.removeAll();
        if (firstCategorie.size()!=0) {
            contentSuggestion.add(new Categorie(frame,firstCategorie,"Derniers Ajouts"));
        }
        if (frame.getestCo()){
            this.secondCategorieBis = frame.getUser().getCollection().getMissingComics();
            if (secondCategorieBis.size()!=0) {
                contentSuggestion.add(new Categorie(frame,secondCategorieBis,"Pour vous")); 
            }else {
                if (secondCategorie.size()!=0) {
                    contentSuggestion.add(new Categorie(frame,secondCategorie,"Aléatoires"));
                }
            }
        }
        else{
            if (secondCategorie.size()!=0) {
                    contentSuggestion.add(new Categorie(frame,secondCategorie,"Aléatoires"));
                }
        }
        
        
        
        if (thirdCategorie.size()!=0) {
            contentSuggestion.add(new Categorie(frame, thirdCategorie, "Les plus populaires"));
        }
    	contentSuggestion.repaint();
    	contentSuggestion.setVisible(true);
    }
    
    private void generateSuggestion(FenetrePrincipale frame) throws IOException, SQLException{
        contentSuggestion.setLayout(new GridLayout(3,1));
        
        this.firstCategorie = test.getLastComics().subList(0,3);
        if (firstCategorie.size()!=0) {
            contentSuggestion.add(new Categorie(frame,firstCategorie,"Derniers Ajouts"));
        }
        
        
        this.secondCategorie = test.getRandomComics().subList(0,3);       
        if (frame.getestCo()){
            this.secondCategorieBis = frame.getUser().getCollection().getMissingComics();
            if (secondCategorieBis.size()!=0) {
                contentSuggestion.add(new Categorie(frame,secondCategorieBis,"Pour vous")); 
            }else {
                if (secondCategorie.size()!=0) {
                    contentSuggestion.add(new Categorie(frame,secondCategorie,"Aléatoires"));
                }
            }
        }else{
            if (secondCategorie.size()!=0) {
                contentSuggestion.add(new Categorie(frame,secondCategorie,"Aléatoires"));
            }
        }


        try(Connection con = DriverManager.getConnection(DBconfig.getUrl(), DBconfig.getUsername(), DBconfig.getPassword())) {
            Statement stmt = con.createStatement();
            this.thirdCategorie = Comic_Collec.getPlusLu(stmt);
            if (thirdCategorie.size() != 0) {
                contentSuggestion.add(new Categorie(frame, thirdCategorie, "Les plus populaires"));
            }
        }
            contentSuggestion.setVisible(true);

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleSuggestion = new javax.swing.JLabel();
        contentSuggestion = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));

        TitleSuggestion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleSuggestion.setForeground(new java.awt.Color(255, 255, 255));
        TitleSuggestion.setText("Suggestions");

        contentSuggestion.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout contentSuggestionLayout = new javax.swing.GroupLayout(contentSuggestion);
        contentSuggestion.setLayout(contentSuggestionLayout);
        contentSuggestionLayout.setHorizontalGroup(
            contentSuggestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentSuggestionLayout.setVerticalGroup(
            contentSuggestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TitleSuggestion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentSuggestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleSuggestion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentSuggestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleSuggestion;
    private javax.swing.JPanel contentSuggestion;
    // End of variables declaration//GEN-END:variables
}
