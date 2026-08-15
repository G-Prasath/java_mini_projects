import java.util.*;

public class Grade{
    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while(running){
            System.out.println("*************************");
            System.out.println("1. Calculate Grade");
            System.out.println("2. Exit");
            System.out.println("*************************");

            System.out.print("Choose Option : ");
            int option = sc.nextInt();

            sc.nextLine(); // consume Enter

            if(option == 1){

                System.out.print("Enter Student Name : ");
                String sName = sc.nextLine();
                System.out.println();
                System.out.print("Enter No of Subjects : ");
                int noSub = sc.nextInt();

                int totalMark = 0;

                for(int i=0; i<noSub; i++){
                    System.out.print("subject "+(i+1)+": ");
                    int mark = sc.nextInt();

                    if(mark > 0 && mark <= 100){
                        totalMark = totalMark + mark;
                    }else{
                        System.out.println("Invalid Marks. Try Again");
                    }
                }

                int avg = totalMark / noSub;
                char grade = 'F';

                if(avg >= 90){
                    grade = 'A';
                }else if(avg >= 80 && avg <= 89){
                    grade = 'B';
                }else if(avg >= 70 && avg <= 79){
                    grade = 'C';
                }else if(avg >= 60 && avg <= 69){
                    grade = 'D';
                }else{
                    grade = 'F';
                }

                
                System.out.println("------------------------");
                System.out.println("Name : " + sName);
                System.out.println("Total : " + totalMark);
                System.out.println("Average : " + avg);
                System.out.println("Grade : " + grade);
            }else if(option == 2){
                running = false;
                System.out.println("Thak You for using this App !");
            }
            else{
                System.out.println("Invalid Options");
            }
        }

    }
}