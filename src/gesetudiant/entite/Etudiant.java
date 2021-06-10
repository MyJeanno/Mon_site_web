
package gesetudiant.entite;

import java.util.Date;

public class Etudiant {
  private int code;
  private String nom;
  private String prenom;
  private Date dnais;
  private String lieu;
  private String filiere;
  private String nationalite;
  private String typetu;

    public Etudiant() {
    }

    public Etudiant(int code, String nom, String prenom, Date dnais, String lieu, String filiere, String nationalite) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.dnais = dnais;
        this.lieu = lieu;
        this.filiere = filiere;
        this.nationalite = nationalite;
    }
    
    public Etudiant(String nom, String prenom, Date dnais, String lieu, String filiere, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.dnais = dnais;
        this.lieu = lieu;
        this.filiere = filiere;
        this.nationalite = nationalite;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDnais() {
        return dnais;
    }

    public void setDnais(Date dnais) {
        this.dnais = dnais;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTypetu() {
        return typetu;
    }

    public void setTypetu(String typetu) {
        this.typetu = typetu;
    } 

    @Override
    public String toString() {
        return nom+" "+prenom;
    }
    
    
  
}
