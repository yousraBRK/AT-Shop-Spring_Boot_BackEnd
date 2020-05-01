package com.yousra.Controller;

import com.yousra.Services.SCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ScategorieController {
    @Autowired
    private SCategorieService sCategorieService;
    private final String  port= "http://localhost:8100";
    @GetMapping("/SCategories")
    @CrossOrigin(origins =""+port)
    public ArrayList ShowSCategories()
    {
        System.out.println("Controller ");
        ArrayList result = (ArrayList) this.sCategorieService.find();
        System.out.println("Return => " + this.sCategorieService.find().getClass());
        return result;
    }

    @RequestMapping(value="/SCategories/{idCat}",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)
    public ArrayList ShowSCategoriesByCat(@PathVariable("idCat") int idCat)
    {
        System.out.println("Controller ");
        ArrayList result = (ArrayList) this.sCategorieService.findScatByCat(idCat);
        System.out.println("Return => " + this.sCategorieService.findScatByCat(idCat).getClass());
        return result;



    }

}
