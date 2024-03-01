// This Java program takes a day number as input and prints the corresponding day of the week

import java.util.Scanner;

class WeekDays
{
    public static void main(String [] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Day Number:");
	int dayNum=sc.nextInt();

	if(dayNum==1)
	{
		System.out.println("Monday");
	}
	else if(dayNum==2)
	{
		System.out.println("Tuesday");
	}
	else if(dayNum==3)
	{
		System.out.println("Wednesday");
	}
	else if(dayNum==4)
	{
		System.out.println("Thursday");
	}
	else if(dayNum==5)
	{
		System.out.println("Friday");
	}
	else if(dayNum==6)
	{
		System.out.println("Saturday");
	}
	else if(dayNum==7)
	{
		System.out.println("Sunday");
	}
	else
	{
		System.out.println("Invalid");
	}
    }
}

/* Output:
   Compile time: Success
   Run time: Enter the Day Number:5
	     Friday
*/