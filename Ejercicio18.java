import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> licenseP = new ArrayList();
      ArrayList<String> model = new ArrayList();
      ArrayList<String> status = new ArrayList();
      boolean next18 = true;

      while(true) {
         while(next18) {
            System.out.println("Welcome to the Vehicle management system");
            System.out.println("Choose an option");
            System.out.println("1. Enter a new Vehicle \n2. Update a vehicle \n3. Show all the vehicles \n4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
               case 1:
                  System.out.println("Enter the license plate of the vehicle: ");
                  String plate = scanner.nextLine();
                  System.out.println("Enter the model: ");
                  String vModel = scanner.nextLine();
                  System.out.println("Enter the status (available/occupied)");
                  String vStatus = scanner.nextLine().toLowerCase();
                  licenseP.add(plate);
                  model.add(vModel);
                  status.add(vStatus);
                  System.out.println("Vehicle registered successfully! ");
                  break;
               case 2:
                  System.out.println("Enter the license plate of the vehicle to update: ");
                  String search = scanner.nextLine();
                  int index = licenseP.indexOf(search);
                  if (index != -1) {
                     System.out.println("Enter the new status (available/occupied): ");
                     String newStatus = scanner.nextLine().toLowerCase();
                     status.set(index, newStatus);
                     System.out.println("Vehicle status updated successfully! ");
                  } else {
                     System.out.println("Vehicle not found...");
                  }
                  break;
               case 3:
                  System.out.println("\n Available Vehicles: ");
                  boolean availableVehicles = false;
                  int i = 0;

                  for(; i < licenseP.size(); ++i) {
                     if (((String)status.get(i)).equals("available")) {
                        PrintStream var10000 = System.out;
                        String var10001 = (String)licenseP.get(i);
                        var10000.println("License Plate: " + var10001 + " | Model: " + (String)model.get(i) + " | Status: " + (String)status.get(i));
                        availableVehicles = true;
                     }
                  }

                  if (!availableVehicles) {
                     System.out.println("No available vehicles at the moment...");
                  }
                  break;
               case 4:
                  next18 = false;
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
