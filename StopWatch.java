import java.util.*;

public class StopWatch {
    public static void main(String[] args) {
        int startTime = 0;
        int elapsedTime = 0;
        boolean isRunning = true, stopwatchRunning = false;

        while(isRunning){
            System.out.println("=========================");
            System.out.println("Stopwatch Simulator!");
            System.out.println("=========================");
            System.out.println("1. Start Stopwatch");
            System.out.println("2. Stop Stopwatch");
            System.out.println("3. Reset Stopwatch");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if(choice == 1){
                if(!stopwatchRunning){
                    startTime = (int) System.currentTimeMillis();
                    stopwatchRunning = true;
                    System.out.println("Stopwatch started!");
                } else {
                    System.out.println("Stopwatch is already running!");
                }
            }else if(choice == 2){
                if(stopwatchRunning){
                    elapsedTime += (int) System.currentTimeMillis() - startTime;
                    stopwatchRunning = false;
                    System.out.println("Stopwatch stopped! Elapsed time: " + elapsedTime / 1000.0 + " seconds");
                } else {
                    System.out.println("Stopwatch is not running!");
                }
            }else if(choice == 3){
                elapsedTime = 0;
                stopwatchRunning = false;
                System.out.println("Stopwatch reset!");
            }else if(choice == 4){
                isRunning = false;
                System.out.println("Exiting Stopwatch Simulator. Goodbye!");
            }else{
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
