
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Manager extends Person{
    private ArrayList<Client> clients;
    
    public Manager(String name) {
        super(name);
    }
    public ArrayList<Client> getClients(){
        return clients;
    }
    public void addClient(Client client){
        this.clients.add(client);
    }
}
