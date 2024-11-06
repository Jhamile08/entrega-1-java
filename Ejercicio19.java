import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> products = new ArrayList();
      ArrayList<String> prices = new ArrayList();
      boolean next19 = true;

      while(true) {
         label26:
         while(next19) {
            System.out.println("\nWelcome to { Inventory with prices management system }");
            System.out.println("\nSelect an option");
            System.out.println("1. Add a new product");
            System.out.println("2. View a list of products");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
               case 1:
                  System.out.println("Enter a new Product: ");
                  String product = scanner.nextLine();
                  System.out.println("Enter a price of the product: ");
                  String price = scanner.nextLine();
                  products.add(product);
                  prices.add(price);
                  break;
               case 2:
                  int i = 0;

                  while(true) {
                     if (i >= products.size()) {
                        continue label26;
                     }

                     PrintStream var10000 = System.out;
                     String var10001 = (String)products.get(i);
                     var10000.println("Name of the product: " + var10001 + " | Price: " + (String)prices.get(i));
                     ++i;
                  }
               case 3:
                  next19 = false;
                  System.out.println("Exiting the program...");
                  break;
               default:
                  System.out.println("Invalid option... try again");
            }
         }

         return;
      }        
    }
}