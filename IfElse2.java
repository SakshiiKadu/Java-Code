//This program checks if the entered number is a two-digit number and then determines if it is even or odd using if else

import java.util.Scanner;

class IfElse2 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 digit Number:");
        int num = sc.nextInt();

        if (num/100==0 && num%10!=num) 
	{
            System.out.println("The number is two digit number");
            if (num % 2 == 0) 
	    {
                System.out.println("The number is Even");
            } 
	    else 
	    {
                System.out.println("The number is Odd");
            }
        } 
	else 
	{
            System.out.println("Please enter two digit number");
        }
    }
}


/* Output:
   Compile time: Success
   Run time: Enter 2 digit Number:34
	     The number is two digit number
             The number is Even
*/
