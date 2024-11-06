
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // client calification
        Scanner scanner = new Scanner(System.in);

       int[] calification = new int[10];
       int five = 0; 
       int sum = 0;

        System.out.println("Welcome to our survey");
        
        for (int i = 0; i < calification.length; i++) {
            System.out.println("please 1 to 5: ");
            int note = scanner.nextInt();
            calification[i] = note;
            if(note == 5){
                five ++;
            }
        }

        for (int i = 0; i < calification.length; i++) {
            sum += calification[i];
        }

        System.out.println("The average is: "+ (sum/calification.length) + " five stars: "+ five);

    }
}
