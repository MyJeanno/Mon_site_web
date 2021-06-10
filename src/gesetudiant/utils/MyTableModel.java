
package gesetudiant.utils;

import gesetudiant.DAO.TraitementEtudiant;
import gesetudiant.DAO.TraitementInscription;
import gesetudiant.entite.Etudiant;
import gesetudiant.entite.Inscription;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class MyTableModel {
    
    private static DefaultTableModel model1;
    private static DefaultTableModel model2;
    private static DefaultComboBoxModel model3;
    
    public static DefaultTableModel getEtudiantModel(){
        String[] titre = {"Id","Nom","Prénoms","Date nais","Lieu","Filière","Nationalité","Statut"};
        model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(titre);
        List<Etudiant> listerAll = new TraitementEtudiant().lister();
        for(Etudiant etu:listerAll){
            String[] donnee = {String.valueOf(etu.getCode()),etu.getNom(),etu.getPrenom(),
                etu.getDnais().toString(),etu.getLieu(),etu.getFiliere(),etu.getNationalite(),
                etu.getTypetu()
            };
            model1.addRow(donnee);
        }
        return model1;
    } 
    
     public static DefaultTableModel getInscriptionModel(){
        String[] titre = {"Id inscription","NOM","PRENOM","Date","Montant"};
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(titre);
       List<Inscription> listIn = new TraitementInscription().lister();
         for (Inscription in : listIn) {
          String[] donnee = {String.valueOf(in.getCodeInscrip()),
                             in.getEtudiant().getNom(),
                             in.getEtudiant().getPrenom(),
                             in.getDateInscrip().toString(),
                             String.valueOf(in.getMontantInscrip())
                             }; 
          model2.addRow(donnee);
         }
       return model2;
    } 
    
    public static DefaultComboBoxModel getEtudiantComboModel(){
      model3 = new DefaultComboBoxModel();  
      List<Etudiant> listEtu = new TraitementEtudiant().lister();
        for (Etudiant etu : listEtu) {
              model3.addElement(etu);
            };
           return model3;  
       } 
  }
    
    

