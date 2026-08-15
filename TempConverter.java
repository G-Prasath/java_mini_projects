import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        char degree = '\u00B0';

        while(running){
            System.out.println("*****************************");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Exit");
            System.out.println("*****************************");

            System.out.print("Choose Options : ");
            int option = sc.nextInt();

            if(option == 1){
                System.out.print("Enter Your Celsius : ");
                int celsius = sc.nextInt();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Fahrenheit : " + fahrenheit + degree + 'F');
            }else if(option == 2){
                System.out.print("Enter Your Fahrenheit : ");
                int fahrenheit = sc.nextInt();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Celsius : "+ celsius + degree + 'C');
            }else if(option == 3){
                System.out.print("Enter Your Celsius : ");
                int celsius = sc.nextInt();
                double kelvin = celsius + 273.15;
                System.out.println("Kelvin : " + kelvin + degree + 'K');
            }else if(option == 4){
                System.out.print("Enter Your Kelvin : ");
                int kelvin = sc.nextInt();
                double celsius = kelvin - 273.15;
                System.out.println("Celsius : "+ celsius + degree + 'C');
            }else if(option == 5){
                running = false;
                System.out.println("Thank You for using this App !");
            }else{
                System.out.println("Choose Valid Option.");
            }

        }
    } 
}
