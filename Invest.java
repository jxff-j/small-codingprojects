/* Investment Earnings */

/* Enter the buying price per share */
/* Enter the closing price on subsequent days */
/* Caluclate aggregrate earnings/losses after each day */
/* Leave program when closing price is negative */


import java.text.DecimalFormat;
import java.util.Scanner; 

public class Invest {

    public static void main(String[] args) {

        // Prompt the user to enter their buying price 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your buying price per share: "); 
        double buyingPrice = scanner.nextDouble(); 
        int day = 1;
        double closingPrice = 0.1;

        // This can only be used by importing the java text package
        DecimalFormat df = new DecimalFormat("0.00"); 
        
        // Check the closing price
        while (true) { 

            System.out.println("Enter the closing price for day " + day + " (any negative value to leave) : ");
            closingPrice = scanner.nextDouble();
            
            if (closingPrice < 0.0) break; // break the while loop if price is less than 0
            double earnings = closingPrice - buyingPrice; 

            // Check the condition from the "earnings" variable
            if (earnings > 0.0) { 
                System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share");
            }
            else if (earnings < 0.0) { 
                System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share"); 
            }
            else { 
                System.out.println("After day " + day + ", you have " + "no earnings per share"); 
            }

            // Increment days
            day += 1; 
        }
        scanner.close();

    }
}