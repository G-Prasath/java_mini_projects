import java.util.*;

public class Atm{
    private double balance;

    public Atm(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount <= 0){
            System.out.println("Enter Deposit Amount");
        }else{
            balance = balance + amount;
            System.out.println("Your Current Balance : " + balance);
        }
    }

    public void Withdraw(int amount){
         if(amount <= 0){
            System.out.println("Enter Withdraw Amount");
        }else if(balance < amount){
            System.out.println("Inscificiate balance");
        }else{
            balance = balance - amount;
            System.out.println("Your Current Balance : " + balance);
        }
    }



    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm(1000);
        
        while(running){
            System.out.println("****************************");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("****************************");


            System.out.print("Choose Menu : ");
            int option = sc.nextInt();

            if(option == 1){
                System.out.println("Your Current Balance : " + atm.getBalance());
            }else if(option == 2){
                System.out.print("Enter Deposit Amount : ");
                int depositAmt = sc.nextInt();
                atm.deposit(depositAmt);
            }else if(option == 3){
                System.out.print("Enter Withdraw Amount : ");
                int withdrawAmt = sc.nextInt();
                atm.Withdraw(withdrawAmt);
            }else if(option == 4){
                running = false;
                System.out.println("Thank for using ATM");
            }else{
                System.out.println("Invalid Options");
            }
        }
    }
}