package com.yousra.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Panier {
    @Id
    @Column(name="username")
    private String username;
    @Column(name="etat_panier")
    private int etat_panier;
    @Column(name="total")
    private int total;

    public Panier(String username, int etat_panier, int total) {
        this.username = username;
        this.etat_panier = etat_panier;
        this.total = total;
    }

    public Panier() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEtat_panier() {
        return etat_panier;
    }

    public void setEtat_panier(int etat_panier) {
        this.etat_panier = etat_panier;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
