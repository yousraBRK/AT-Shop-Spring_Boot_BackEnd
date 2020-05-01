package com.yousra.Repository;

import com.yousra.Entity.Favoris;
import com.yousra.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface MySqlFavorie extends JpaRepository<Favoris, Id> {

    @Query(nativeQuery = true, value = "select * from favoris f where f.username=?1 and f.id_produit =?2 ")
    public List<Favoris> findFavorie(String username, int id_produit);

    @Query(nativeQuery = true, value = "insert from favoris f where f.username=?1 ")
    public List<Favoris> AddFavorie(String username, int id_produit);




}
