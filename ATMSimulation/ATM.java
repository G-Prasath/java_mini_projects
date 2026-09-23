package ATMSimulation;

public class ATM {

    // Initialize the account number, pin, and balance
    private int accountNumber;
    private int pin;
    private double balance;

    // Constructor to initialize the account number, pin, and balance
    public ATM(int accountNumber, int pin, double balance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getters

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    // Setters

    public void setPin(int pin){
        this.pin = pin;
    }


}
