import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] reservation = new char[6][6];
        System.out.println("Welcome to Flight Reservation Management System!");

        // Inicializar los asientos como disponibles ('O')
        for (int i = 0; i < reservation.length; ++i) {
            for (int c = 0; c < reservation[i].length; ++c) {
                reservation[i][c] = 'O';
            }
        }

        boolean next20 = true;

        while (next20) {
            // Mostrar la disposición de asientos
            System.out.println("    1   2   3   4   5   6");
            for (int i = 0; i < reservation.length; i++) {
                System.out.print((char) ('A' + i) + "   ");
                for (int j = 0; j < reservation[i].length; j++) {
                    System.out.print(reservation[i][j] + "   ");
                }
                System.out.println();
            }

            System.out.println("Enter the id of the selected seat [A1 to F6]:");
            String ticket = scanner.nextLine().toUpperCase();
            if (ticket.length() < 2) {
                System.out.println("Invalid seat id, please try again");
                continue;
            }
            
            int row = ticket.charAt(0) - 'A';
            int col = Character.getNumericValue(ticket.charAt(1)) - 1;

            if (row >= 0 && row < 6 && col >= 0 && col < 6) {
                if (validateSeat(reservation, row, col)) {
                    reservation[row][col] = 'X';
                    System.out.println("Seat reserved successfully");
                } else {
                    System.out.println("Seat already occupied");
                }
            } else {
                System.out.println("Invalid seat id, please try again");
            }

            System.out.println("Do you want to reserve another seat? (yes/no)");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                next20 = false;
            }
        }

        scanner.close();
    }

    public static boolean validateSeat(char[][] seats, int row, int col) {
        return seats[row][col] == 'O';
    }
}
