package com.yousra.Repository;

import com.yousra.Entity.Panier_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface MySqlPanierDetails extends JpaRepository<Panier_details, Id> {



    @Query(nativeQuery = true,value = "Select * from panier_details pd where pd.username=?1")
    List<Panier_details> ShowCartProduct(String username);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "Update panier_details pd set pd.qte_produit=pd.qte_produit+ ?3 where pd.username=?1 and pd.id_produit=?2")
    void UbdateCart(String username, int id_produit, int qte);
}
