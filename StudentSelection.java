/* Student Selection */

/* Enter number of students */
/* Input student names and ages */
/* Use arrays */
/* Determine who are above 15 years old to receive a vaccine */

import java.util.Scanner; 

public class StudentSelection {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: "); 
        int numStudents = scanner.nextInt();

        String[] student = new String[numStudents];
        int[] age = new int[numStudents];

        // Two more scanner objects can be used to receive the names and ages  
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in); 
        
        for (int i = 0; i < numStudents; i++) { 

            System.out.println("Enter name: "); 

            // Store user input 
            student[i] = scanName.nextLine();

            System.out.println("Enter age: "); 
            age[i] = scanAge.nextInt();
        }

        for (int i = 0; i < numStudents; i++) { 

            if (age[i] >= 15) { 

                System.out.println(student[i] + " can receive the vaccine");
                System.out.println("The student is now " + age[i] +  " years old"); 

            }
        }
        scanner.close();
        scanName.close();
        scanAge.close(); 

    }
}
