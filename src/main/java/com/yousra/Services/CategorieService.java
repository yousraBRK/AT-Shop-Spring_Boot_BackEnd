package com.yousra.Services;

import com.yousra.Entity.Categorie;
import com.yousra.Repository.MySqlCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private MySqlCategorie mySqlService;


    public List<Categorie> findCategories()
    {
        System.out.println("In Services " + this);
        return this.mySqlService.findCategories();
    }
    public List<Categorie>findCategoriesById(int id)
    {
        System.out.println("In Services " + this);
        return this.mySqlService.findCategoriesById(id);
    }

}
