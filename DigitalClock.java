import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DigitalClock {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while(true){
            LocalTime currentTime = LocalTime.now();
            String time = currentTime.format(formatter);
            System.out.println("\r" + time);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                    break;
            }
        }
    }
}
