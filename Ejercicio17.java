import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String[] projects = new String[5];
      int[] notes = new int[5];

      int i;
      for(i = 0; i < 5; ++i) {
         System.out.println("Enter the name of the project: ");
         projects[i] = scanner.nextLine();
         System.out.println("Enter the qualification of the project: ");
         notes[i] = scanner.nextInt();
         scanner.nextLine();
      }

      for(i = 0; i < notes.length - 1; ++i) {
         for(int j = 0; j < notes.length - 1; ++j) {
            if (notes[j] < notes[j + 1]) {
               int tempNote = notes[j];
               notes[j] = notes[j + 1];
               notes[j + 1] = tempNote;
               String tempProject = projects[j];
               projects[j] = projects[j + 1];
               projects[j + 1] = tempProject;
            }
         }
      }

      System.out.println("\nProjects ordered by grade:");

      for(i = 0; i < 5; ++i) {
         System.out.println("Project: " + projects[i] + " | Grades: " + notes[i]);
      }
        
    }
}
