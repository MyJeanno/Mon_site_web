/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesetudiant.DAO;

import gesetudiant.conbd.AccessDB;
import gesetudiant.entite.Inscription;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Microlink
 */
public class TraitementInscription implements IDiverseFonction<Inscription> {

    @Override
    public boolean enregistrer(Inscription i) {
    Connection con = AccessDB.obtenirConnection();
        boolean enr = false;
        String req = "INSERT INTO inscription(DateInsc,MontantInsc,ID)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(req);
            ps.setDate(1, new java.sql.Date(i.getDateInscrip().getTime()));
            ps.setInt(2, i.getMontantInscrip());
            ps.setInt(3, i.getIdEt());
            enr = ps.executeUpdate()==1;
            JOptionPane.showMessageDialog(null, "Insertion réussie avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
       return enr; 

    }
    
    @Override
    public List<Inscription> lister() {
    Connection conn = AccessDB.obtenirConnection();
    ResultSet rs;
    List<Inscription> lister = new ArrayList<>();
    String req = "Select * from inscription";
        try {
             Statement st = conn.createStatement();
             rs = st.executeQuery(req);
             while (rs.next()) {                
             Inscription i = new Inscription();
             //Etudiant e = new Etudiant();
             i.setCodeInscrip(rs.getInt("IdIns"));
             i.setDateInscrip(rs.getDate("DateInsc"));
             i.setMontantInscrip(rs.getInt("MontantInsc"));
             i.setIdEt(rs.getInt("ID"));
             i.setEtudiant(new TraitementEtudiant().selectionnerEtu(rs.getInt("ID")));
             lister.add(i);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TraitementInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
      return lister;
    }

    @Override
    public boolean update(Inscription t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean supprimer(Inscription t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public int nombreInscrit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {   
        List<Inscription> lister = new TraitementInscription().lister();
        for (Inscription in : lister) {
            System.out.println(in.getCodeInscrip()+" | "+in.getDateInscrip()+" | "+in.getMontantInscrip()+" | "+in.getIdEt());
        }
    }
    
}
