//Java program that uses a switch statement to determine and print the grade based on the given marks

class GradingSystemSwitch 
{
    public static void main(String[] args)
    {
        int marks = 50;

        switch (marks) 
        {
            case 80:
            case 90:
            case 100:
                System.out.println("A+ Grade");
                break;

            case 60:
            case 70:
                System.out.println("B+ Grade");
                break;

            case 40:
            case 50:
                System.out.println("C+ Grade");
                break;

            case 35:
            case 30:
            case 20:
            case 10:
                System.out.println("E+ Grade");
                break;

            default:
                System.out.println("Fail");
        }
    }
}

/* Output:
   Compile time: Success
   Run time: C+ Grade
*/