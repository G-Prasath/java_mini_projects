import java.util.*;

public class PassGen {
    public static void main(String[] args) {
        // Code to generate a password
        Scanner sc = new Scanner(System.in);
        System.out.println("**************");
        System.out.println("Password Generator");
        System.out.println("**************");

        System.out.print("Enter the length of the password: ");
        int length = sc.nextInt();

        Random random = new Random();

        String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";


        String allCharacters = upperLetters + lowerLetters + numbers + symbols;

        String password = "";

        for(int i=0; i< length; i++){
            int indexs = random.nextInt(allCharacters.length());
            password += allCharacters.charAt(indexs);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}
