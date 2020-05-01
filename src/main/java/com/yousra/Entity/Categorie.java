package com.yousra.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Categorie {
    @Id
    @Column(name="id_categorie")
private int id_categorie;
    @Column(name="nom_categorie")
private String nom_categorie;
private int afficher_categorie;

    public Categorie(int id_categorie, String nom_categorie, int afficher_categorie) {
        this.id_categorie = id_categorie;
        this.nom_categorie = nom_categorie;
        this.afficher_categorie = afficher_categorie;
    }

    public Categorie() {
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getNom_categorie() {
        return nom_categorie;
    }

    public void setNom_categorie(String nom_categorie) {
        this.nom_categorie = nom_categorie;
    }

    public int getAfficher_categorie() {
        return afficher_categorie;
    }

    public void setAfficher_categorie(int afficher_categorie) {
        this.afficher_categorie = afficher_categorie;
    }
}
