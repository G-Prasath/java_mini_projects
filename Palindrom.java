import java.util.*;

public class Palindrom {
   public static void main(String[] args) {
    
        System.out.println("====================");
        System.out.println("Palindrom Checker");
        System.out.println("====================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your word : ");
        String input = sc.next();

        int start = 0;
        int end = input.length()-1;

        boolean isPalindrom = true;

        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                isPalindrom = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrom){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Valid Palindrom");
        }
        
   } 
}
