package ATMSimulation;

import java.util.*;

public class ATMManager{
    private Atm atm;
    
    public ATMManager(Atm atm){
       this.atm = atm;
    }

    // Login
    public boolean login(int enteredPin){
        if(enteredPin == atm.getPin()){
            System.out.println("Login successful.");
            return true;
        }

        System.out.println("Incorrect PIN.");
        return false;
    }

    // Check Balance
    public void checkBalance(){
        atm.checkBalance();
    }

    // deposite
    public void deposite(int amount){
        atm.deposite();
    }

    
   
}   