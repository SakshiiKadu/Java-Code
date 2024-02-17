// Java program to calculate the sum of natural numbers within a given range

class SumOfNaturalNumbersInRange 
{  
    public static void main(String[] args) 
{
        int a = 1; // The starting point of the range
        int b = 10; // The ending point of the range (Example range [1, 10])

        // Calculating the sum of natural numbers in the given range using the formula
        // Sum = b * (b + 1) / 2 - (a - 1) * a / 2
        int sum = (b * (b + 1) / 2) - ((a - 1) * a / 2);

        System.out.println("Sum of natural numbers in the range [" + a + ", " + b + "]: " + sum);
    }
}

/* Output:
   Compile time: Success
   Run time: Sum of natural numbers in the range [1, 10]: 55
*/
