package com.yousra.Repository;

import com.yousra.Entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface MySqlCategorie extends JpaRepository <Categorie, Id> {
    @Query(nativeQuery = true, value = "select * from Categorie")
    public List<Categorie> findCategories();

    @Query(nativeQuery = true, value = "select * from Categorie c where c.id_categorie =?1")
    public List<Categorie> findCategoriesById(int id);

}
