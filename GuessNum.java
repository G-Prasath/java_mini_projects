import java.util.*;

public class GuessNum {
    public static void main(String[] args){
        int computerNumber = (int) (Math.random() * 10) + 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Guess the number between 1 and 10: ");
        int userNumber = scan.nextInt();

        while(userNumber != computerNumber){
            System.out.println("Computer Guessing Number : ******");

            if(userNumber < computerNumber){
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
            System.out.print("Guess Again:");
            userNumber = scan.nextInt();
        }

        System.out.println("Congratulations! You guessed the number: " + computerNumber);
    }
}
