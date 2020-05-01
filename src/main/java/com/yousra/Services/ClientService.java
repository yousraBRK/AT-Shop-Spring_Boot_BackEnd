package com.yousra.Services;

import com.yousra.Entity.Client;
import com.yousra.Repository.MySqlClient;
import com.yousra.Repository.MySqlPanier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

@Autowired
    private MySqlClient mySqlClient;
@Autowired
private MySqlPanier mySqlPanier;

    public List<Client> find()
    {
        System.out.println("In Services " + this);
        return this.mySqlClient.find();
    }


    public void AddClient(Client client)
    {
        System.out.println("In Services " + this);
        this.mySqlClient.save(client);
        String username=client.getUsername();
        this.mySqlPanier.AddCart(username);
    }

    public Client ConnexionClient(String username, String password)
    {
        System.out.println("In Services " + this);
        return this.mySqlClient.ConnexionClient(username,password);
    }
}
