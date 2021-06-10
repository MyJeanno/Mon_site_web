/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesetudiant.DAO;

import java.util.List;

/**
 *
 * @author Microlink
 */
public interface IInscription<T> {
    public boolean enregistrer(T t); 
    
    public boolean update(T t);
    
    public boolean supprimer(T t);
    
    public List<T> lister();
    
    public int nombreInscrit();
}
