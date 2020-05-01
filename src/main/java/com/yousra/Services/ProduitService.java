package com.yousra.Services;

import com.yousra.Entity.Client;
import com.yousra.Entity.Produit;
import com.yousra.Repository.MySqlProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private MySqlProduit mySqlProduit;
    public List<Produit> findProduct()
    {
        this.mySqlProduit.findProduct();
        System.out.println("In Services " + this);
        System.out.println(" get class of mySqlProduit" + this.mySqlProduit.findProduct().getClass());
        return this.mySqlProduit.findProduct();
    }
    public List<Produit> findPromoProduct()
    {
        this.mySqlProduit.findPromoProduct();
        System.out.println("In Services " + this);
        System.out.println(" get class of mySqlProduit" + this.mySqlProduit.findPromoProduct().getClass());
        return this.mySqlProduit.findProduct();
    }

    public List<Produit> findProductByCat(int idCat)
    {
        this.mySqlProduit.findProductByCat(idCat);
        System.out.println("In Services " + this);
        System.out.println(" get class of mySqlProduit" + this.mySqlProduit.findProductByCat(idCat).getClass());
        return this.mySqlProduit.findProductByCat(idCat);
    }
    public List<Produit> findByUser(String username)
    {
        return this.mySqlProduit.FindFavorisByUser(username);
    }
    public List<Produit> findByCartUser(String username)
    {
        return this.mySqlProduit.FindProductByCartUser(username);
    }

}
