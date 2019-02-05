
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
public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<Client> clients;
    private ArrayList<Manager> managers;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.managers = new ArrayList<>();
    }
    
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public ArrayList<Client> getClients() {
        return clients;
    }
    public ArrayList<Manager> getManagers() {
        return managers;
    }
    
    public void addAccount(int id){
        Account account = new Account(id);
        this.accounts.add(account);
    }
    public void addManager(String name){
        Manager manager = new Manager(name);
        this.managers.add(manager);
    }
    public void addClient(String name){
        Client client = new Client(name);
        this.clients.add(client);
    }
    
    public void asociarClientManager(String nameC, String nameM){
        int i;
        int j;
        for(i = 0; i < this.clients.size(); i++){
            if(this.clients.get(i).getName().equals(nameC)){
                break;
            }
        }
        for(j = 0; j < this.managers.size(); j++){
            if(this.managers.get(j).getName().equals(nameM)){
                break;
            }
        }
        this.clients.get(i).setManager(this.managers.get(j));
        this.managers.get(j).addClient(this.clients.get(i));
    }
}
