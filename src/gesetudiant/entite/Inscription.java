/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesetudiant.entite;

import java.util.Date;

/**
 *
 * @author Microlink
 */
public class Inscription {
    private int codeInscrip;
    private Date dateInscrip;
    private int montantInscrip;
    private Etudiant etudiant;
    private int idEt;

    public Inscription() {
    }

    public Inscription(int codeInscrip, Date dateInscrip, int montantInscrip, Etudiant etudiant) {
        this.codeInscrip = codeInscrip;
        this.dateInscrip = dateInscrip;
        this.montantInscrip = montantInscrip;
        this.etudiant = etudiant;
    }

    public int getCodeInscrip() {
        return codeInscrip;
    }

    public void setCodeInscrip(int codeInscrip) {
        this.codeInscrip = codeInscrip;
    }

    public Date getDateInscrip() {
        return dateInscrip;
    }

    public void setDateInscrip(Date dateInscrip) {
        this.dateInscrip = dateInscrip;
    }

    public int getMontantInscrip() {
        return montantInscrip;
    }

    public void setMontantInscrip(int montantInscrip) {
        this.montantInscrip = montantInscrip;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public int getIdEt() {
        return idEt;
    }

    public void setIdEt(int idEt) {
        this.idEt = idEt;
    }

    @Override
    public String toString() {
        return codeInscrip+" "+getEtudiant().getNom()+" "+getEtudiant().getPrenom()+" "+dateInscrip+" "+montantInscrip;
    }
    
    
    
    
}
