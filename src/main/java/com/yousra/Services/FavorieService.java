package com.yousra.Services;


import com.yousra.Entity.Favoris;
import com.yousra.Entity.Produit;
import com.yousra.Repository.MySqlFavorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorieService {

    @Autowired
    private MySqlFavorie mySqlFavorie;

    public List<Favoris> findFavorie(String username, int id_produit)
    {
        System.out.println("In Services " + this);
        return this.mySqlFavorie.findFavorie(username,id_produit);
    }

    public void AddFavorite(Favoris favoris)
    {
        System.out.println("In Services " + this);
        this.mySqlFavorie.save(favoris);
    }

    public void DeleteFavorite(Favoris favoris) {
        System.out.println("In Services " + this);
        this.mySqlFavorie.delete(favoris);
    }

    public List<Favoris> find() {
        return this.mySqlFavorie.findAll();
    }


}
