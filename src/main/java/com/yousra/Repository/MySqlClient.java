package com.yousra.Repository;

import com.sun.xml.bind.v2.model.core.ID;
import com.yousra.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;
@Repository
public interface MySqlClient extends JpaRepository<Client, Id> {
    @Query(nativeQuery = true, value = "select * from client")
    public List<Client> find();

    //@Query(nativeQuery = true, value = "insert into client (username,password1,email,nom,prenom,num_fix,num_tel,etat,adresse) values (?1.getUsername(), ?1.getPassword1(),?1.getEmail(),?1.getNom(),?1.getPrenom(),?1.getNum_fix(),?1.getNum_tel(),1,?1.getAdresse())")
    @Query(nativeQuery = true, value = "insert into client (username) values (?1.getUsername())")
    public void AddClient(Client client);

    @Query(nativeQuery = true, value = "SELECT * FROM client c WHERE c.username= ?1  AND password1= ?2")
    public Client ConnexionClient(String username,String password);
}
