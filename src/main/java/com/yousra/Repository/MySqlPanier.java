package com.yousra.Repository;

import com.yousra.Entity.Panier;
import com.yousra.Entity.Panier_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;

@Repository
public interface MySqlPanier extends JpaRepository<Panier, Id> {

    @Query(nativeQuery = true,value = "Select p.prix from produit p where p.id_produit =?1")
    int getPrice(int id_produit);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE panier p SET p.etat_panier=1 ,p.total=p.total+ ?3*?2 WHERE username=?1")
    void UbdateCart(String username,int id_produit,int qte,int prix);


    @Query(nativeQuery = true,value = "insert into  panier p (p.username,p.etat_panier,p.total) values (?1,0,0)")
    void AddCart(String username);
}
