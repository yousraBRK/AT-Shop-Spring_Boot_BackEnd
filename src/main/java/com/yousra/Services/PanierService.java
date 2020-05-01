package com.yousra.Services;

import com.yousra.Entity.Panier;
import com.yousra.Repository.MySqlPanier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanierService {
    @Autowired
    private MySqlPanier mySqlPanier;
    public void AddToCart(Panier panier) {
        this.mySqlPanier.save(panier);

    }

    public List<Panier> ShowCart() {
        return this.mySqlPanier.findAll();
    }
}
