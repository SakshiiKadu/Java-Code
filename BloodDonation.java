/*
    This program determines eligibility for blood donation based on criteria such as age, hemoglobin level,
    presence of diseases, and drug addiction.

    Eligibility Criteria:
    - Age must be between 18 and 60 (inclusive).
    - Hemoglobin level must be 13 or higher.
    - No existing diseases allowed.
    - No history of drug addiction.
*/

class BloodDonation 
{
    public static void main(String[] args) 
    {
        int hemoglobin = 13;
        int age = 25;
        boolean disease = false;
        boolean drugaddict = false;

        if (age > 18 && age <= 60) 
	{
            if (hemoglobin >= 13) 
	    {
                if (disease==false) 
	 	{
                    if (drugaddict==false) 
		    {
                        System.out.println("You are eligible for Blood Donation");
                    } 
		    else 
		    {
                        System.out.println("You cannot donate because you are a drug addict");
                    }
                } 
	        else 
		{
                    System.out.println("You cannot donate blood because you have a disease");
                }
            } 
	    else 
	    {
                System.out.println("You cannot donate blood because your hemoglobin is less than 13");
            }
        } 
	else {
            System.out.println("Your age is not valid for donating blood");
        }
    }
}


/* Output:
   Compile time: Success
   Run time: You are eligible for Blood Donation
*/