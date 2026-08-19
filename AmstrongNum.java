import java.util.*;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        String input = sc.next();

        int len = input.length();
        int res = 0;

        for(int i=0; i<len; i++){
            int digit =input.charAt(i) - '0';
            res += Math.pow(digit, len);
        }
        
        if(input.equals(res + "")){
            System.out.println(input + " : is Amstrong Number");
        }else{
            System.out.println(input + " : Not an Amstrong Number");
        }
    }
}
