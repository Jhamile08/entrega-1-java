import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // task list
        Scanner scanner = new Scanner(System.in);

        String [] tasksList = new String[10];
        boolean[] completedTasks = new boolean[10];

        System.out.println("Welcome");

        int option;
        do {
            System.out.println("press 1 for create, 2 for mark or 3 for watch");
            option = scanner.nextInt();

            int numberTasks;

            if(option == 1){

                System.out.println("wich number of tasks do you want create?: ");
                numberTasks = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < numberTasks; i++) {
                    System.out.println("Create your task number: "+(i+1)
                    ); 
                    tasksList[i] = scanner.nextLine();
                    completedTasks[i] = false;
                }
                
            }else if(option == 2){

                System.out.println("Enter the task number to marck as completed: ");
                int taskNumber = scanner.nextInt();
        
                if(taskNumber >= 0 && taskNumber < 10){
                    completedTasks[taskNumber] = true;
                    System.out.println("Task "+ taskNumber + "Marked as completed");
                }else System.out.println("Invalid");
                
            }else if(option == 3){
                for (int i = 0; i < tasksList.length; i++) {
                    String status = completedTasks[i] ? "Completed":"Pending";
                    System.out.println("This are your tasks");
                    System.out.println((i+1) + "." + tasksList[i] + "-" + status);
                }
            }
        } while (option != 0);
    }
}
