// Hands On examples from Section 3

package examples;

public class Squares 
{
	public static void main (String[] args)	
	{
		/********************************************************************
		** Use a Scanner to read from standard in - standard in = keyboard **
		*********************************************************************/
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		/*
		this program computes the square of the number entered by user
		*/
	
		int num = 0;
		int result = 0;
		int count = 0;
		
		/* loop 3 times */		
		for (count = 0; count < 3; count = count + 1) 
		{	
			System.out.println("Please enter a number");
			System.out.print("   (less than 46341):");
			num = scanner.nextInt();
	
			/* keep number reasonable size */
			if (num < 46341) 
			{	
				result = num * num;
				System.out.print("The result of squaring " + num);
				System.out.println(" is:\t" + result);
				System.out.println();
			}
			else 
			{
				System.err.println("Input # " + num + " is too large.");
			}
		}
		scanner.close();	
	}	
}