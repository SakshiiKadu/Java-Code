// Java program to check if a variable is Odd or Even using Ternaray Operator

class CheckVariableOddOrEven
{
    public static void main(String[] args)
    {
        int v1 = 20;

        // If 'v1 % 2' is equal to 0, then 'v1' is even, otherwise it's odd
        String result = (v1 % 2 == 0) ? "V1 is Even" : "V1 is Odd";

        System.out.println(result);
    }
}

/* Output:
   Compile time: Success
   Run time: V1 is Even
*/