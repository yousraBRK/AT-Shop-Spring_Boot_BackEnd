package com.yousra.Repository;


import com.yousra.Entity.SCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;
import java.util.List;

public interface MySqlSCategorie extends JpaRepository <SCategorie, Id> {

    @Query(nativeQuery = true, value = "select * from Scategorie")
    public List<SCategorie> find();

    @Query(nativeQuery = true, value = "select * from Scategorie sc where sc.id_categorie =?1")
    public List<SCategorie> findScatByCat(int idCat);
}
