// This is a simple Java program to calculate and display the report card for a student.

import java.util.Scanner;

class SchoolReportCard
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter marks for Physics:");
	int a=sc.nextInt();
	
	System.out.print("Enter marks for Biology:");
	int b=sc.nextInt();

	System.out.print("Enter marks for Maths:");
	int c=sc.nextInt();

	System.out.print("Enter marks for Chemistry:");
	int d=sc.nextInt();

	System.out.print("Enter marks for Marathi:");
	int e=sc.nextInt();

	int total=a+b+c+d+e;
	System.out.println("The sum of obtained marks is:"+total);

	int total_marks=500;

	double p= (total*100)/total_marks;
	System.out.println("The Percentage are:"+p);

	char grade=(p<=100&&p>85)?('A'):((p<=85&&p>65)?('B'):((p<=65&&p>45)?('C'):((p<=45&&p>35)?('D'):('F'))));
	System.out.println("The Grade is:"+grade);

	String remark=(grade=='A')?("Very Good"):((grade=='B')?("Good"):((grade=='C')?("Need to Improve"):((grade=='D')?("Work Hard"):("Fail"))));
	System.out.println("The Remarks is:"+remark);

	System.out.println("*****************************************************************************************************************");
	System.out.println("						           Little Flowers");
	System.out.println(" ");
	System.out.println("                                                                 SSC");
	System.out.println("          Name:Sakshi Kadu                                                                      Date:21-2-24");
	System.out.println(" ");
	System.out.println("          Roll No:34                                   sec:A                                    Exam:Insem");
	System.out.println("*****************************************************************************************************************");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("          Subject Name                               Total Marks                                Marks Obtained");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println(" ");
	System.out.println("        1. Physics				          100                                        "+a);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("        2. Biology			                  100                                        "+b);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("        3. Maths				          100                                        "+c);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("        4.Chemistry				          100                                        "+d);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("        5. Marathi				          100                                        "+e);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();
	System.out.println("                                                  Total Marks=500                           Marks Obtained:"+total);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("         Percentage:"+p+"                                                               Grade:"+grade );
	System.out.println();
	System.out.println("         Remark:"+remark+"                                                              Signature:$K*" );
	
}
}
