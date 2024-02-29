//This program takes input for the current month (1-12) and determines the corresponding season

import java.util.Scanner;

class SeasonDetector 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current month (1-12): ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) 
	{
            if (month >= 3 && month <= 5) 
	    {
                System.out.println("The Current Season is SPRING");
            } 
	    else if (month >= 6 && month <= 8) 
	    {
                System.out.println("The Current Season SUMMER");
            } 
	    else if (month >= 9 && month <= 11) 
	    {
                System.out.println("The Current Season AUTUMN");
            } 
	    else 
	    {
                System.out.println("The Current Season WINTER");
            }

         } 
	else  
	{
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }
}

/* Output:
   Compile time: Success
   Run time: Enter the current month (1-12): 4
             The Current Season is SPRING
*/