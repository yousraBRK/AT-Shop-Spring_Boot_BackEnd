package com.yousra.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(Panier_details.class)
@Table
public class Panier_details implements Serializable {
    @Id
    @Column(name="username")
    private String username;
    @Id
    @Column(name="id_produit")
    private int id_produit;
    @Column(name="qte_produit")
    private int qte_produit;

    public Panier_details(String username, int id_produit,int qte_produit) {
        this.username = username;
        this.id_produit = id_produit;
        this.qte_produit=qte_produit;
    }

    public Panier_details() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public int getQte_produit() {
        return qte_produit;
    }

    public void setQte_produit(int qte_produit) {
        this.qte_produit = qte_produit;
    }
}
