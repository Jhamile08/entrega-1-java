
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // book a cine sit
        Scanner scanner = new Scanner(System.in);
        String continueRegister = "yes";
        char[][] matriz = new char[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = 'O';
            }
        }

        do {

        System.out.println("Welcome to the cine, look the sit avaible and choose: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("what row do you want?: ");
        int row = scanner.nextInt();
        row = row-1;

        System.out.println("what column do you want?: ");
        int column = scanner.nextInt();
        column = column-1;
        scanner.nextLine();

        if(matriz[row][column] == 'O'){
            System.out.println("This are your sit: "+ matriz[row][column]);
            matriz[row][column] = 'X';
            System.out.println("Book succesful");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Do you want register other enter yes, if don't want enter no ");
            continueRegister = scanner.nextLine();
        }else System.out.println("the sit "+  matriz[row][column]+ " is already book, please choose other");



    } while (!continueRegister.equalsIgnoreCase("no"));
    scanner.close();
}
}
