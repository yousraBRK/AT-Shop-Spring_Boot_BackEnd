package com.yousra.Controller;

import com.yousra.Entity.Favoris;
import com.yousra.Entity.Produit;
import com.yousra.Entity.ReturnedObject;
import com.yousra.Services.FavorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FavorieController {

    @Autowired
    private FavorieService favorieService;
    private final String  port= "http://localhost:8100";





    @RequestMapping(value="/Favoris",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)
    public ArrayList ShowFavorie() {
        System.out.println("Controller ");
        System.out.println("Controller " + this.favorieService.find());
        ArrayList result = (ArrayList) this.favorieService.find();
        System.out.println("Return => " + this.favorieService.find().getClass());
        return result;

    }






    @RequestMapping(value="/Favoris/{username}/{id_produit}",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)

    public ArrayList ShowFavorieById(@PathVariable("username") String username,@PathVariable("id_produit") int id_produit) {
        System.out.println("Controller ");
        System.out.println("Controller " + this.favorieService.findFavorie(username,id_produit));
        ArrayList result = (ArrayList) this.favorieService.findFavorie(username,id_produit);
        System.out.println("Return => " + this.favorieService.findFavorie(username,id_produit).getClass());
        return result;

    }
    @RequestMapping(value="/AddFavorite",method = RequestMethod.POST)
    @CrossOrigin(origins =""+port)
    public ReturnedObject<Favoris> AddFavorie(@RequestBody Favoris favoris) {
        this.favorieService.AddFavorite(favoris);
        System.out.println("Controller ");
        System.out.println(""+ favoris.getUsername());
        ReturnedObject object = new ReturnedObject(favoris,true,"Favorie ajouté !");
        return object;
    }

    @RequestMapping(value="/DeleteFromFavorite")
    @CrossOrigin(origins =""+port)
    public ReturnedObject<Favoris> DeleteFromFavorite(@RequestBody Favoris favoris) {
        this.favorieService.DeleteFavorite(favoris);
        System.out.println("Controller ");
        System.out.println(""+ favoris.getUsername());
        ReturnedObject object = new ReturnedObject(favoris,true,"Favorie supprimé !");
        return object;
    }
}
