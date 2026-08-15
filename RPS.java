import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {
            System.out.println("****************************");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");
            System.out.println("****************************");

            System.out.print("Choose Menu : ");
            int option = sc.nextInt();

            int randomNum = (int) (Math.random() * 3) + 1; // Random choice for computer (1-3)
            String computerChoice = (randomNum == 1 ? "Rock" : randomNum == 2 ? "Paper" : "Scissors");

            if (option == 1) {
                System.out.println("Rock");
                System.out.println(computerChoice);

                if (computerChoice.equals("Rock")) {
                    System.out.println("It's a Draw!");
                } else if (computerChoice.equals("Scissors")) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("Computer Wins!");
                }
            } else if (option == 2) {
                System.out.println("Paper");
                System.out.println(computerChoice);

                if (computerChoice.equals("Paper")) {
                    System.out.println("It's a Draw!");
                } else if (computerChoice.equals("Rock")) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("Computer Wins!");
                }
            } else if (option == 3) {
                System.out.println("Scissors");
                System.out.println(computerChoice);

                if (computerChoice.equals("Paper")) {
                    System.out.println("It's a Draw!");
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("Computer Wins!");
                }
            } else if (option == 4) {
                System.out.println("Exiting the game...");
                running = false;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
