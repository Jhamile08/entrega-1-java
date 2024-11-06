import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      float[] monthly = new float[12];

      for(int i = 0; i < 12; ++i) {
         boolean next16 = false;

         while(!next16) {
            try {
               System.out.println("Enter the expense for month " + (i + 1) + ": ");
               float expense = scanner.nextFloat();
               if (expense >= 0.0F) {
                  monthly[i] = expense;
                  next16 = true;
               } else {
                  System.out.println("Please enter a positive value...");
               }
            } catch (Exception var8) {
               System.out.println("Invalid input. Please enter a numerical value");
               scanner.nextLine();
            }
         }
      }

      float total = 0.0F;
      float[] var10 = monthly;
      int var12 = monthly.length;

      for(int var6 = 0; var6 < var12; ++var6) {
         float expense = var10[var6];
         total += expense;
      }

      float average = total / 12.0F;
      System.out.println("The total expense is: " + total);
      System.out.println("The year per month average: " + average);        
    }
}
