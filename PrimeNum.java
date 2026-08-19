import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Prime Number Checker");
        System.out.println("====================");

        Scanner sc = new Scanner(System.in);
        boolean isvalid = true;
        System.out.print("Enter You Number : ");
        int input = sc.nextInt();

        if(input <= 1) System.out.println("Is Not a Prime Number");

        for(int i=2; i<(input-1); i++){
            if(input % i == 0){
                isvalid = false;
            }
        }

        if(isvalid){
            System.out.println(input + " : is Prime Number");
        }else{
            System.out.println(input + " : is Not Prime Number");
        }

    }
}
