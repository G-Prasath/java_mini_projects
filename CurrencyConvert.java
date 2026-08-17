import java.util.*;

public class CurrencyConvert {
    public static void main(String[] args) {
       boolean running = true;
       Scanner scanner = new Scanner(System.in);
       
       while(running){
        System.out.println("*************************");
        System.out.println("Currency Converter");
        System.out.println("*************************");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to USD");
        System.out.println("4. USD to EUR");
        System.out.println("5. INR to EUR");
        System.out.println("6. EUR to INR");
        System.out.println("7. Exit");
        System.out.println("*************************");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if(choice == 7){
            running = false;
            System.out.println("Exiting the program.");
            break;
        }
        else if(choice == 1){
            System.out.print("Enter amount in USD: ");
            int amount = scanner.nextInt();
            double convertedAmount = amount * 82.0; // Example conversion rate
            System.out.println(amount + " USD = " + convertedAmount + " INR");
        }
        else if(choice == 2){
            System.out.print("Enter amount in INR: ");
            int amount = scanner.nextInt();
            double convertedAmount = amount / 82.0; // Example conversion rate
            System.out.println(amount + " INR = " + convertedAmount + " USD");
        }
        else if(choice == 3){
            System.out.print("Enter amount in EUR: ");
            int amount = scanner.nextInt();
            double convertedAmount = amount * 1.1; // Example conversion rate
            System.out.println(amount + " EUR = " + convertedAmount + " USD");
        }
        else if(choice == 4){
            System.out.print("Enter amount in USD: ");
            int amount = scanner.nextInt();
            double convertedAmount = amount / 1.1; // Example conversion rate
            System.out.println(amount + " USD = " + convertedAmount + " EUR");
        }
        else if(choice == 5){
            System.out.print("Enter amount in INR: ");
            int amount = scanner.nextInt();
            double convertedAmount = amount / 90.0; // Example conversion rate
            System.out.println(amount + " INR = " + convertedAmount + " EUR");
        }
        else if(choice == 6){
            System.out.print("Enter amount in EUR: ");
            int amount = scanner.nextInt();
            double convertedAmount = amount * 90.0; // Example conversion rate
            System.out.println(amount + " EUR = " + convertedAmount + " INR");
        }
        else{
            System.out.println("Invalid choice. Please try again.");
        }



       }
    }
}
