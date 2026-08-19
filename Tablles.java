import java.util.*;

public class Tablles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which Multiplex table You Want : ");
        int numOftable = sc.nextInt();

        System.out.print("No of Rows You Want : ");
        int noOfrow = sc.nextInt();

        for(int i=1; i<=noOfrow; i++){
            System.out.println(i + "X" + numOftable + "=" + i*numOftable);
        }
    }
}
