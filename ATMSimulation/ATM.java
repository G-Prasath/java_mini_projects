package ATMSimulation;

public class Atm {

    // Initialize the account number, pin, and balance
    private int accountNumber;
    private int pin;
    private double balance;

    // Constructor to initialize the account number, pin, and balance
    public Atm(int accountNumber, int pin, double balance) {
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
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Deposite
    public void deposite(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance = balance + amount;
        System.out.println("Amount deposited: ₹" + amount);
        System.out.println("New balance: ₹" + balance);
    }

    // Widthdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid widthdraw amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance = balance - amount;
        System.out.println("Amount Withdraw: ₹" + amount);
        System.out.println("New balance: ₹" + balance);
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Change PIN
    public boolean changePin(int oldPin, int newPin) {
        if (this.pin != oldPin) {
            System.out.println("Old PIN is incorrect.");
            return false;
        }

        if (newPin < 1000 || newPin > 9999) {
            System.out.println("PIN must contain 4 digits.");
            return false;
        }

        this.pin = newPin;

        System.out.println("PIN changed successfully.");
        return true;
    }
}
