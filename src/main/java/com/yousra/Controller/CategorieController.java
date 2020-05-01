package com.yousra.Controller;


import com.yousra.Services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CategorieController {
    @Autowired
    private CategorieService categorieService;
    private final String  port= "http://localhost:8100";
    @GetMapping("/Categories")
    public ArrayList ShowCategories()
    {
        System.out.println("Controller ");
        ArrayList result = (ArrayList) this.categorieService.findCategories();
        System.out.println("Return => " + this.categorieService.findCategories().getClass());
        return result;

    }

    @RequestMapping(value="/Categories/{id}",method = RequestMethod.GET)
    @CrossOrigin(origins =""+port)
    public ArrayList getCategorieById(@PathVariable("id") int id)
    {
        return (ArrayList) this.categorieService.findCategoriesById(id);
    }



}
