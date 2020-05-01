package com.yousra.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(Favoris.class)
@Table
public class Favoris implements Serializable {
@Id
@Column(name="username")
private String username;
@Id
@Column(name="id_produit")
private int id_produit;

    public Favoris(String username, int id_produit) {
        this.username = username;
        this.id_produit = id_produit;
    }

    public Favoris()  {
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
}
