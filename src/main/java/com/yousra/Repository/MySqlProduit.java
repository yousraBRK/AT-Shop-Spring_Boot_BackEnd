package com.yousra.Repository;


import com.yousra.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface MySqlProduit extends JpaRepository <Produit, Id> {
    @Query(nativeQuery = true,value = "select * from produit")
    public List<Produit> findProduct();

    @Query(value = "select * from produit p where p.promo =1",nativeQuery = true)
    public List<Produit> findPromoProduct();

    @Query(nativeQuery = true,value = "select * from produit p where p.id_scategorie in (select sc.id_scategorie from scategorie sc where sc.id_categorie = ?1)")
    public List<Produit> findProductByCat(int idCat);

    @Query(nativeQuery = true, value = " select * from produit p where p.id_produit in (select f.id_produit  from favoris f where f.username=?1 ) ")
    public List<Produit> FindFavorisByUser(String username);



    @Query(nativeQuery = true, value = " select * from produit p where p.id_produit in (select pd.id_produit  from panier_details pd where pd.username=?1 ) ")
    List<Produit> FindProductByCartUser(String username);
}
