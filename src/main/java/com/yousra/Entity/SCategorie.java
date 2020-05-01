package com.yousra.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SCategorie {

    @Id
    @Column(name="id_scategorie")
    private int id_scategorie;
    @Column(name="nom_scategorie")
    private  String nom_scategorie;
    @Column(name="id_categorie")
    private int id_categorie;
    @Column(name="afficher_scategorie")
    private int afficher_scategorie;

    public SCategorie(int id_scategorie, String nom_scategorie, int id_categorie, int afficher_scategorie) {
        this.id_scategorie = id_scategorie;
        this.nom_scategorie = nom_scategorie;
        this.id_categorie = id_categorie;
        this.afficher_scategorie = afficher_scategorie;
    }

    public SCategorie() {
    }

    public int getId_scategorie() {
        return id_scategorie;
    }

    public void setId_scategorie(int id_scategorie) {
        this.id_scategorie = id_scategorie;
    }

    public String getNom_scategorie() {
        return nom_scategorie;
    }

    public void setNom_scategorie(String nom_scategorie) {
        this.nom_scategorie = nom_scategorie;
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public int getAfficher_scategorie() {
        return afficher_scategorie;
    }

    public void setAfficher_scategorie(int afficher_scategorie) {
        this.afficher_scategorie = afficher_scategorie;
    }
}
