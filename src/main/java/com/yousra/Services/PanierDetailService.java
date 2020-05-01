package com.yousra.Services;

import com.yousra.Entity.Panier_details;
import com.yousra.Repository.MySqlPanier;
import com.yousra.Repository.MySqlPanierDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanierDetailService {
    @Autowired
    private MySqlPanierDetails mySqlPanierDetails;
    @Autowired
    private com.yousra.Repository.MySqlPanier mySqlPanier;

    public List<Panier_details> ShowCartProduct(String username) {

        return this.mySqlPanierDetails.ShowCartProduct(username);
    }

    public void AddToCartNew(Panier_details panier_details) {
         this.mySqlPanierDetails.save(panier_details);
         String username=panier_details.getUsername();
         int qte =panier_details.getQte_produit();
         int id_produit =panier_details.getId_produit();
         int prix=mySqlPanier.getPrice(id_produit);
         this.mySqlPanier.UbdateCart(username,id_produit,qte,prix);
    }

    public void UbdateCart(Panier_details panier_details) {
        String username=panier_details.getUsername();
        int qte =panier_details.getQte_produit();
        int id_produit =panier_details.getId_produit();
        int prix=mySqlPanier.getPrice(id_produit);

        this.mySqlPanierDetails.UbdateCart(username,id_produit,qte);
        this.mySqlPanier.UbdateCart(username,id_produit,qte,prix);


    }
}
