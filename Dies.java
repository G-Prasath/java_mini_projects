import java.util.*;

public class Dies {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("DICE ROLLER");
        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter Number of Dies : ");
        int numOfDies = sc.nextInt();

        for(int i=1; i<=numOfDies; i++){
            int dice = rand.nextInt(6) + 1;
            System.out.println("Die " + i + " : " + dice);
        }

        sc.close();

    }
}
