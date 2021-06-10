
package gesetudiant.DAO;

import java.util.List;

/**
 *
 * @author hppp
 * @param <T> type d'un objet donné
 */
public interface IDiverseFonction<T> {
    
    public boolean enregistrer(T t); 
    
    public boolean update(T t);
    
    public boolean supprimer(T t);
    
    public List<T> lister();
    
    public int nombreInscrit();
    
}
