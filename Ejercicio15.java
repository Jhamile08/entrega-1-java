
import java.util.Scanner;

public class Ejercicio15 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      char[][] quota = new char[4][4];

      for(int i = 0; i < quota.length; ++i) {
         for(int c = 0; c < quota[i].length; ++c) {
            quota[i][c] = 'O';
         }
      }

      boolean next15 = true;

      while(next15) {
         System.out.println("    1   2   3   4\nA   " + quota[0][0] + "   " + quota[0][1] + "   " + quota[0][2] + "   " + quota[0][3] + "\nB   " + quota[1][0] + "   " + quota[1][1] + "   " + quota[1][2] + "   " + quota[1][3] + "\nC   " + quota[2][0] + "   " + quota[2][1] + "   " + quota[2][2] + "   " + quota[2][3] + "\nD   " + quota[3][0] + "   " + quota[3][1] + "   " + quota[3][2] + "   " + quota[3][3] + "\n");
         System.out.println("Enter the id of the select seat [A1 to D4]");
         String ticket = scanner.nextLine().toUpperCase();
         int row = ticket.charAt(0) - 65;
         int col = Character.getNumericValue(ticket.charAt(1)) - 1;
         if (row >= 0 && row < 4 && col >= 0 && col < 4) {
            if (validateRoom(quota, row, col)) {
               quota[row][col] = 'X';
               System.out.println("Room reserved successfully");
            } else {
               System.out.println("Room already occupied");
            }
         } else {
            System.out.println("Invalid room id, please try again");
         }

         System.out.println("Do you want to reserve another room? (yes/no)");
         String response = scanner.nextLine().toLowerCase();
         if (!response.equals("yes")) {
            next15 = false;
         }
      }

   }

   public static boolean validateRoom(char[][] rooms, int row, int col) {
      return rooms[row][col] == 'O';
   }
 
}
