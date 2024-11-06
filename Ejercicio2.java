import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // event ticket manager
        int numTickesAvailable = 3;
        do {
            System.out.println("Welcome, enter yes for book or not for leave");
            String option = scanner.nextLine();
            if(option.equals("yes")){
                numTickesAvailable--;
                System.out.println("Your book was succesful, remain: "+ numTickesAvailable);
            }else if(option.equals("not")){
                System.out.println("Cheer up, remain: "+ numTickesAvailable);
            }
            if(numTickesAvailable == 0){
                System.out.println("The tickets are sold out");
            }
            
        } while (numTickesAvailable > 0);
        scanner.close();
    }
}
