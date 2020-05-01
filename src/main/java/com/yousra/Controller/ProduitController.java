package com.yousra.Controller;

import com.yousra.Entity.Produit;
import com.yousra.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProduitController {

    @Autowired
    private ProduitService produitService;
    private final String  port= "http://localhost:8100";
    @GetMapping("/Produits")
    @CrossOrigin(origins =""+port)
    public ArrayList ShowProducts() {
        System.out.println("Controller ");
        System.out.println("Controller " + this.produitService.findProduct().getClass());
        ArrayList result = (ArrayList) this.produitService.findProduct();
        System.out.println("Return => " + this.produitService.findProduct().getClass());
        return result;

    }
    @GetMapping("/PromoProduits")
    @CrossOrigin(origins =""+port)
    public ArrayList ShowPromoProducts() {
        System.out.println("Controller ");
        System.out.println("Controller " + this.produitService.findPromoProduct().getClass());
        ArrayList result = (ArrayList) this.produitService.findPromoProduct();
        System.out.println("Return => " + this.produitService.findPromoProduct().getClass());
        return result;

    }

    @RequestMapping(value = "/Produits/{idCat}",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)
    public ArrayList ShowProductsByCat(@PathVariable("idCat")int idCat) {
        System.out.println("Controller ");
        System.out.println("Controller " + this.produitService.findProductByCat(idCat).getClass());
        ArrayList result = (ArrayList) this.produitService.findProductByCat(idCat);
        System.out.println("Return => " + this.produitService.findProductByCat(idCat).getClass());
        return result;

    }


    @RequestMapping(value="/Produits/Favoris/{username}",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)

    public List<Produit> ShowFavorieByUser(@PathVariable("username")String username) {
        System.out.println("Controller ");
        System.out.println("Controller " + this.produitService.findByUser(username));
        System.out.println("Return => " + this.produitService.findByUser(username).getClass());
        return this.produitService.findByUser(username);


    }

    @RequestMapping(value="/Produits/Panier/{username}",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)

    public List<Produit> ShowProductByCartUser(@PathVariable("username")String username) {
        System.out.println("Controller ");
        System.out.println("Controller " + this.produitService.findByCartUser(username));
        System.out.println("Return => " + this.produitService.findByCartUser(username).getClass());
        return this.produitService.findByCartUser(username);


    }

}
