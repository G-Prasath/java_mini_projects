import java.util.*;

public class Coin {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Coin Toss Simulator!");
        System.out.println("=========================");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many times would you like to toss the coin?");
        int numberOfTosses = scanner.nextInt();

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < numberOfTosses; i++) {
            int tosNum = random.nextInt(2);
            if (tosNum == 0) {
                System.out.println("Toss " + (i + 1) + ": Heads");
                heads++;
            } else {
                System.out.println("Toss " + (i + 1) + ": Tails");
                tails++;
            }
        }

        System.out.println("Total Heads: " + heads);
        System.out.println("Total Tails: " + tails);

    }
}
