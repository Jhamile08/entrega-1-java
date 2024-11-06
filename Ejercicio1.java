import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Verify if the user is an adult
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if( age >= 18){
            System.out.println("You have permission");
        } else System.out.println("Don't have permission");
        
        scanner.close();
    }
}
