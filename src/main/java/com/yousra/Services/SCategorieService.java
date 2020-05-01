package com.yousra.Services;


import com.yousra.Entity.SCategorie;
import com.yousra.Repository.MySqlSCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SCategorieService {
    @Autowired
    private MySqlSCategorie mySqlSCategorie;

    public List<SCategorie> find()
    {
        System.out.println("In Services " + this);
        return this.mySqlSCategorie.find();
    }

    public List<SCategorie> findScatByCat(int idCat)
    {
        System.out.println("In Services " + this);
        return this.mySqlSCategorie.findScatByCat(idCat);
    }
}
