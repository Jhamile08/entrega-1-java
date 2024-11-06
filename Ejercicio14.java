
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> employees = new ArrayList<>();

        System.out.println("Welcome to the payment");
        int option = 0;
        do { 
            System.out.println("1. add employee, 2. search by name, 3. show employee");
            option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1){
                
                    ArrayList<String> employee = new ArrayList<>();

                    System.out.println("Enter the employee name: ");
                    employee.add(scanner.nextLine());

                    System.out.println("Enter the employee puesto: ");
                    employee.add(scanner.nextLine());

                    System.out.println("Enter the employee salary: ");
                    employee.add(scanner.nextLine());
    
                    employees.add(employee);
                
            }else if(option == 2){
                System.out.println("Enter the name for search: ");
                String name = scanner.nextLine();
                found(employees, name);
            } else if(option == 3){
                show(employees);
            }     
        } while (option != 0);

        scanner.close();
        
    }
    public static void show(ArrayList<ArrayList<String>> employees){
        System.out.println("------------------------------");
        for (int i = 0; i < employees.size(); i++) {
            ArrayList<String> employee = employees.get(i);
            System.out.println("------------------------------");
            System.out.println("Employee #"+(i+1)+ ":");
            System.out.println("name: "+ employee.get(0));
            System.out.println("puesto: "+ employee.get(1));
            System.out.println("salary: "+ employee.get(2));
        }
        System.out.println("------------------------------");
    } 
    public static void found(ArrayList<ArrayList<String>> employees, String name){
        System.out.println("------------------------------");
        boolean found = false;
        for (ArrayList<String> employee : employees) {
            if(employee.get(0).equalsIgnoreCase(name)){
                System.out.println("Employee found");
                System.out.println("name: "+ employee.get(0));
                System.out.println("puesto: "+ employee.get(1));
                System.out.println("salary: "+ employee.get(2));
                System.out.println("------------------------------");
                found = true;
                break;
            }
            if(!found){
                System.out.println("Employee not found");
            }


        }
        System.out.println("------------------------------");
    } 
}
