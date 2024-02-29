/*
    This program defines a simple grading system based on the marks obtained.
    It categorizes the grades as follows:
    - A+ Grade for marks between 80 and 100
    - B+ Grade for marks between 60 and 79
    - C+ Grade for marks between 40 and 59
    - E+ Grade for marks between 35 and 39
    - Fail for marks below 35
*/

class GradingSystem 
{
    public static void main(String[] args) 
    {
        int marks = 70;

        if (marks >= 80 && marks <= 100) 
        {
            System.out.println(" A+ Grade");
        } 
        else if (marks >= 60 && marks < 80) 
        {
            System.out.println(" B+ Grade");	
        } 
        else if (marks >= 40 && marks < 60) 
        {
            System.out.println(" C+ Grade");	
        } 
        else if (marks >= 35 && marks < 40) 
        {
            System.out.println(" E+ Grade");	
        } 
        else 
        {
            System.out.println("Fail");
        }
    }
}


/* Output:
   Compile time: Success
   Run time: B+ Grade
*/