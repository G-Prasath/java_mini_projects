import java.util.*;

public class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose Options: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter First Number: ");
                int a = scanner.nextInt();
                System.out.print("Enter Second Number: ");
                int b = scanner.nextInt();
                Calc calc = new Calc();
                int result = calc.add(a, b);
                System.out.println("Result: " + result);
            } else if (option == 2) {
                System.out.print("Enter First Number: ");
                int a = scanner.nextInt();
                System.out.print("Enter Second Number: ");
                int b = scanner.nextInt();
                Calc calc = new Calc();
                int result = calc.subtract(a, b);
                System.out.println("Result: " + result);
            } else if (option == 3) {
                System.out.print("Enter First Number: ");
                int a = scanner.nextInt();
                System.out.print("Enter Second Number: ");
                int b = scanner.nextInt();
                Calc calc = new Calc();
                int result = calc.multiply(a, b);
                System.out.println("Result: " + result);
            } else if (option == 4) {
                running = false;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}