package com.yousra.Controller;

import com.yousra.Entity.Panier;
import com.yousra.Entity.Panier_details;
import com.yousra.Entity.ReturnedObject;
import com.yousra.Services.PanierDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PanierDetailController {
    @Autowired
    private PanierDetailService panierDetailService;
    private final String  port= "http://localhost:8100";


    @RequestMapping(value="/ShowCartProduct/{username}",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)
    public List<Panier_details> ShowCartProduct(@PathVariable(value="username")String username) {
        System.out.println(this+"Controller ");
        return this.panierDetailService.ShowCartProduct(username);

    }

    @RequestMapping(value="/AddToCartNew",method = RequestMethod.POST)
    @CrossOrigin(origins =""+port)
    public ReturnedObject<Panier_details> AddToCart(@RequestBody Panier_details panier_details)
    {

        System.out.println(panier_details);
        this.panierDetailService.AddToCartNew(panier_details);
        System.out.println(this+"Controller ");
        System.out.println(""+ panier_details.getUsername());
        ReturnedObject object = new ReturnedObject(panier_details,true,"");
        return object;
    }

    @RequestMapping(value="/UbdateCart",method = RequestMethod.POST)
    @CrossOrigin(origins =""+port)
    public ReturnedObject<Panier_details> UbdateCart(@RequestBody Panier_details panier_details)
    {

        System.out.println(panier_details);
        this.panierDetailService.UbdateCart(panier_details);
        System.out.println(this+"Controller ");
        System.out.println(""+ panier_details.getUsername());
        ReturnedObject object = new ReturnedObject(panier_details,true,"Favorie ajouté !");
        return object;
    }


}
