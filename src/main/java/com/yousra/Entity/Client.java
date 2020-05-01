package com.yousra.Entity;


import javax.persistence.*;

@Entity
@Table

public class Client {
     @Id

     @Column(name="username")
    String username;
    @Column(name="email")
    String email;
    @Column(name="password1")
    String password;
    @Column(name="nom")
    String nom;
    @Column(name="prenom")
    String prenom;
    @Column(name="num_fix")
    String num_fix;
    @Column(name="num_tel")
    String num_tel;
    @Column(name="etat")
    int etat=0;

    public Client(String username, String email, String password, String nom, String prenom, String num_fix, String num_tel, int etat) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.nom= nom;
        this.prenom = prenom;
        this.num_fix = num_fix;
        this.num_tel = num_tel;
        this.etat=etat;
    }

    public Client() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getNum_fix() {
        return num_fix;
    }

    public void setNum_fix(String num_fix) {
        this.num_fix = num_fix;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
