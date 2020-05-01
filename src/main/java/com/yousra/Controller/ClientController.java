package com.yousra.Controller;

import com.yousra.Entity.Client;
import com.yousra.Entity.ReturnedObject;
import com.yousra.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    private final String  port= "http://localhost:8100";
    @GetMapping("/Client")
    @CrossOrigin(origins =""+port)
    public ArrayList ShowClients()
    {
        System.out.println("Controller ");
        ArrayList result = (ArrayList) this.clientService.find();
        System.out.println("Return => " + this.clientService.find().getClass());
        return result;
    }

    @RequestMapping(value="/AddClient",method = RequestMethod.POST)
    @CrossOrigin(origins =""+port)
    public ReturnedObject<Client> AddClient(@RequestBody Client client)
    {
        System.out.println("Controller "+client.getUsername());
        this.clientService.AddClient(client);
        String msg ="Inscription Réussite";
        ReturnedObject<Client> RObject = new ReturnedObject<Client>(client,true,msg);
        return RObject;
    }

    @RequestMapping(value="/Connexion",method = RequestMethod.POST)
    @CrossOrigin(origins =""+port)
    public ReturnedObject<Client>Connexion(@RequestBody Client client)
    {
        System.out.println("Controller "+client.getUsername());
        String username =client.getUsername();
        String password =client.getPassword();
        Client ReturnedClient;
       ReturnedClient= this.clientService.ConnexionClient(username,password);
        String msg ="Connexion Réussite";
        ReturnedObject<Client> RObject = new ReturnedObject<Client>(ReturnedClient,true,msg);
        return RObject;
    }


}
