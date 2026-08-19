import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int val = sc.nextInt();

        int start = 0;
        int end = 1;

        for(int i=1; i<=val; i++){
             System.out.print(start + " ");
            int temp = start + end;
            start = end;
            end = temp;
        }

        sc.close();
    }
}
