import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Mini inventory for a store
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> quantityProduct = new ArrayList<>();

        System.out.println("Welcome to store inventory");
        int option;
        do { 
            System.out.println("1. enter product, 2. delete product, 3. product list, 0. exit");
            option = scanner.nextInt();

            if( option == 1 ){
                System.out.println("How many products do you want add?");
                int quantityAdd = scanner.nextInt();
                scanner.nextLine();
                for ( int i = 0; i < quantityAdd; i++){
                    System.out.println("Name's product: ");
                    String nameProduct = scanner.nextLine();
                    int position = products.indexOf(nameProduct);
                    
                    if( position != -1){
                        System.out.println("Product already exist put quantity: ");
                        Integer numsProduct = scanner.nextInt();
                        int newValue = quantityProduct.get(position) + numsProduct;
                        quantityProduct.set(position, newValue);
                    } else {
                        products.add(nameProduct);                    
                        System.out.println("quantity's product: ");
                        int numsProduct = scanner.nextInt();
                        quantityProduct.add(numsProduct);
                        }
                    scanner.nextLine();
                }
            }else if (option == 2){
                System.out.println("Enter product number that you what remove: ");
                int delete = scanner.nextInt();
                delete = delete -1;
                products.remove(delete);
                System.out.println("product deleted");
                
            } else if (option == 3){
                System.out.println("--------------------------");    
                for( int i= 0; i < products.size(); i++){
                    System.out.println( i+1+". " + products.get(i) + " quantity: " + quantityProduct.get(i));
                }
                System.out.println("--------------------------");
            }

        } while (option != 0);


    }

  
}
