
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
public class Client extends Person{
    private Manager manager;
    private ArrayList<Account> accounts;

    public Client(String name) {
        super(name);
        this.accounts = new ArrayList<>();
    }
    public Manager getManager(){
        return this.manager;
    }
    public void setManager(Manager manager){
        this.manager = manager;
    }
    public ArrayList<Account> getAccounts(){
        return this.accounts;
    }
    public void addAccount(Account account){
        this.accounts.add(account);
    }
    
}
