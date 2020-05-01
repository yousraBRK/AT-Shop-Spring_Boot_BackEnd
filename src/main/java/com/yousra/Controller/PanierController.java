package com.yousra.Controller;

import com.yousra.Entity.Favoris;
import com.yousra.Entity.Panier;
import com.yousra.Entity.ReturnedObject;
import com.yousra.Services.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PanierController {

    @Autowired
    private PanierService panierService;
    private final String  port= "http://localhost:8100";

    @RequestMapping(value="/AddCart",method = RequestMethod.POST)
    @CrossOrigin(origins =""+port)
    public ReturnedObject<Panier> AddCart (@RequestBody Panier panier) {
        this.panierService.AddToCart(panier);
        System.out.println("Controller ");
        System.out.println(""+ panier.getUsername());
        ReturnedObject object = new ReturnedObject(panier,true,"Favorie ajouté !");
        return object;
    }

    @RequestMapping(value="/ShowCart",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)
    public List<Panier> ShowCart() {
        System.out.println("Controller ");
       return this.panierService.ShowCart();

    }
}
