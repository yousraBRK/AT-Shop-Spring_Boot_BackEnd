package com.yousra.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table
public class Produit {

    @Id
    @Column(name="id_produit")
    private int id_produit;
    @Column(name="modele")
    private String modele;
    @Column(name="id_marque")
    private int id_marque;

    @Column(name="prix")
    private int prix;
    @Column(name="prix_an")
    private int prix_an;
    @Column(name="details")
    private String details;
    @Column(name="disponible")
    private int disponible;
    @Column(name="id_scategorie")
    private int id_scategorie;
    @Column(name="nouveaute")
    private int nouveaute;
    @Column(name="date_ajout")
    private Date  date_ajout;
    @Column(name="sav")
    private String sav;
    @Column(name="promo")
    private int promo;
    @Column(name="afficher")
    private int afficher;
    @Column(name="image_min")
    private String image_min;

    public Produit(int id_produit, int id_marque, String modele, int prix, int prix_an, String details, int disponible, int id_scategorie, int nouveaute, Date date_ajout, String sav, int promo, int afficher, String image_min)

    {
        this.id_produit = id_produit;
        this.modele = modele;
        this.id_marque = id_marque;

        this.prix = prix;
        this.prix_an = prix_an;
        this.details = details;
        this.disponible = disponible;
        this.id_scategorie = id_scategorie;
        this.nouveaute = nouveaute;
        this.date_ajout = date_ajout;
        this.sav = sav;
        this.promo = promo;
        this.afficher = afficher;
        this.image_min = image_min;
    }



    public Produit() {
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public int getId_marque() {
        return id_marque;
    }

    public void setId_marque(int id_marque) {
        this.id_marque = id_marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrix_an() {
        return prix_an;
    }

    public void setPrix_an(int prix_an) {
        this.prix_an = prix_an;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public int getId_scategorie() {
        return id_scategorie;
    }

    public void setId_scategorie(int id_scategorie) {
        this.id_scategorie = id_scategorie;
    }

    public int getNouveaute() {
        return nouveaute;
    }

    public void setNouveaute(int nouveaute) {
        this.nouveaute = nouveaute;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public String getSav() {
        return sav;
    }

    public void setSav(String sav) {
        this.sav = sav;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    public int getAfficher() {
        return afficher;
    }

    public void setAfficher(int afficher) {
        this.afficher = afficher;
    }

    public String getImage_min() {
        return image_min;
    }

    public void setImage_min(String image_min) {
        this.image_min = image_min;
    }
}
