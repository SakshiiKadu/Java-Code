//Program demonstrates the use of switch statement to print corresponding weekday based on a given day number

class WeekDaysSwitch 
{
    public static void main(String[] args) 
    {
        int dayNum = 4;

        switch (dayNum) 
	{
            case 1 : System.out.println("Monday");
		     break;
            case 2 : System.out.println("Tuesday");
		     break;
            case 3 : System.out.println("Wednesday");
		     break;
            case 4 : System.out.println("Thursday");
		     break;
            case 5 : System.out.println("Friday");
		     break;
            case 6 : System.out.println("Saturday");
		     break;
            case 7 : System.out.println("Sunday");
		     break;
            default : System.out.println("Invalid");
        }
    }
}

/* Output:
   Compile time: Success
   Run time: Thursday
*/