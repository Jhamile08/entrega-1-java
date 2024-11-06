import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> userName = new ArrayList<>();
        ArrayList<String> userEmail = new ArrayList<>();
        ArrayList<String> userPassword = new ArrayList<>();
        
        // register
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to register");
        String continueRegister;

        do {
        System.out.println("Enter your name: ");
        userName.add(scanner.nextLine());

        System.out.println("Enter your email: ");
        userEmail.add(scanner.nextLine());
        String userPaswordValidate;
        boolean auxMayus, auxNumber;


        do { 
            auxNumber = false;
            auxMayus = false;

            System.out.println("Enter your password: ");
            userPaswordValidate = scanner.nextLine();
            
            if(userPaswordValidate.length() >= 6 ){
                for (int i = 0; i < userPaswordValidate.length(); i++) {
                    if(Character.isDigit(userPaswordValidate.charAt(i))){
                        auxNumber = true;
                    } 
                    if(Character.isUpperCase(userPaswordValidate.charAt(i))){
                        auxMayus = true;
                    } 
                }
                    if(!auxMayus){
                        System.out.println("Password must to be 1 mayus");
                    }
                    if(!auxNumber){
                        System.out.println("Password must to be 1 digit");
                    }
            } else {
                System.out.println("Password must be greater than 6");
            }
        } while (userPaswordValidate.length() < 6 || !auxMayus || !auxNumber);

        if( auxMayus && auxNumber ){
            userPassword.add(userPaswordValidate);
            for (int i = 0; i < userName.size(); i++) {
                System.out.println("Registered users");
                System.out.println("Users name: "+ userName.get(i) + " email: "+ userEmail.get(i));
            }
        } else {
            System.out.println("Invalid");
        }

        System.out.println("Do you want register other, if don't want enter no ");
        continueRegister = scanner.nextLine();

    } while (!continueRegister.equalsIgnoreCase("no"));

        scanner.close();
    }
}
