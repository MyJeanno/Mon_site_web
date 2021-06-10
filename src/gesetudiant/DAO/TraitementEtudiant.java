
package gesetudiant.DAO;
import gesetudiant.conbd.AccessDB;
import gesetudiant.entite.Etudiant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TraitementEtudiant implements IDiverseFonction<Etudiant> {
    
    public Etudiant selectionnerEtu(int cle){    
        Connection con = AccessDB.obtenirConnection();
        String req = "SELECT * FROM etudiant WHERE ID ='"+cle+"' ";  
        ResultSet rs; 
        Etudiant et = new Etudiant();
    try {
        Statement st = con.createStatement();
        rs = st.executeQuery(req);
        while(rs.next()){
          et.setCode(rs.getInt("ID"));
          et.setNom(rs.getString("NOM"));
          et.setPrenom(rs.getString("PRENOM"));
          et.setDnais(rs.getDate("DATENAIS"));
          et.setLieu(rs.getString("LIEU"));
          et.setFiliere(rs.getString("FILIERE"));
          et.setNationalite(rs.getString("NATIONALITE"));
          et.setTypetu(rs.getString("TYPETUDIANT"));       
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
    } 
    return et;
}

 @Override
    public boolean enregistrer(Etudiant et) {
       Connection con = AccessDB.obtenirConnection();
        boolean enr = false;
        String req = "INSERT INTO etudiant(NOM,PRENOM,DATENAIS,LIEU,FILIERE,NATIONALITE,TYPETUDIANT)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(req);
            ps.setString(1, et.getNom());
            ps.setString(2, et.getPrenom());
            ps.setDate(3, new java.sql.Date(et.getDnais().getTime()));
            ps.setString(4, et.getLieu());
            ps.setString(5, et.getFiliere());
            ps.setString(6, et.getNationalite());
            ps.setString(7, et.getTypetu());
            enr = ps.executeUpdate()==1;
            JOptionPane.showMessageDialog(null, "Insertion réussie avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
       return enr; 
    }

    @Override
    public boolean update(Etudiant et) {
     Connection con = AccessDB.obtenirConnection();
        boolean modif = false;
        String req = "UPDATE etudiant set NOM=?, PRENOM=?, DATENAIS=?, LIEU=?, FILIERE=?,"
                + "NATIONALITE=?,TYPETUDIANT=? WHERE ID=?";
        try {
            PreparedStatement ps = con.prepareStatement(req);
            ps.setString(1, et.getNom());
            ps.setString(2, et.getPrenom());
            ps.setDate(3, new java.sql.Date(et.getDnais().getTime()));
            ps.setString(4, et.getLieu());
            ps.setString(5, et.getFiliere());
            ps.setString(6, et.getNationalite());
            ps.setString(7, et.getTypetu());
            ps.setInt(8, et.getCode());
            modif = ps.executeUpdate()==1;
            JOptionPane.showMessageDialog(null, "Modification effectuée avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modif;

    }

    @Override
    public boolean supprimer(Etudiant t) {
    Connection con = AccessDB.obtenirConnection();
    boolean suppr = false;
    String req = "DELETE FROM etudiant WHERE ID = ?";   
     try {
         PreparedStatement ps = con.prepareStatement(req);
         ps.setInt(1, t.getCode());
         suppr = ps.executeUpdate() == 1;
         JOptionPane.showMessageDialog(null, "Etudiant supprimé");
     } catch (SQLException ex) {
         Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
     } 
    return suppr;
  }    
    
     @Override
    public List<Etudiant> lister() {
    Connection con = AccessDB.obtenirConnection();
    List<Etudiant> liste = new ArrayList<>();     
    ResultSet rs;
    String req = "SELECT * FROM etudiant";
     try {
         Statement st = con.createStatement();
         rs = st.executeQuery(req);
         while(rs.next()){
          Etudiant et = new Etudiant();
          et.setCode(rs.getInt("ID"));
          et.setNom(rs.getString("NOM"));
          et.setPrenom(rs.getString("PRENOM"));
          et.setDnais(rs.getDate("DATENAIS"));
          et.setLieu(rs.getString("LIEU"));
          et.setFiliere(rs.getString("FILIERE"));
          et.setNationalite(rs.getString("NATIONALITE"));
          et.setTypetu(rs.getString("TYPETUDIANT"));
          liste.add(et);
         }
     } catch (SQLException ex) {
         Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
     }
     return liste;
    }
    
     @Override
    public int nombreInscrit() {
      return lister().size();
    }

    
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date d = df.parse("14/05/1989");
        Etudiant e = new Etudiant("KOFFI", "Koko", d, "Lomé", "GL", "Togolaise");
        new TraitementEtudiant().enregistrer(e);
        
//        Etudiant e = new Etudiant();
//        e.setCode(2);
//        e.setNom("SEWAVI");
//        e.setPrenom("Maurice");
//        //Conversion d'une date en String
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        Date d = df.parse("14/05/1989");
//        e.setDnais(d);
//        e.setLieu("Anié");
//        e.setFiliere("SR");
//        e.setNationalite("Béninoise");
//        new TraitementEtudiant().supprimerEtudiant(e);
        
//        List<Etudiant> lister = new TraitementEtudiant().lister();
//        for (Etudiant et : lister) {
//            System.out.println(et.getCode()+" | "+et.getNom()+" | "+et.getPrenom()+" | "+et.getLieu()+" | "+et.getFiliere());
//        }

        //Inscription i = new Inscription();
        //i.setEtudiant(new TraitementEtudiant().selectionnerEtu(8));
        //System.out.println(i.getEtudiant());
    }
  
}
