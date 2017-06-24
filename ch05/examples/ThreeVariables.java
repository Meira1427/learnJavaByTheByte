package examples;

public class ThreeVariables 
{
    public static void main(String[] args) 
	{
        //initialize scanner
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		//declare & intialize variables. Note: I am making class a character, not an interger per assignment
        int Department = 0;
		float Salary = 0F;
		String Class = "H";
		
		//Prompt department number
        System.out.print("Please enter department number: ");
		
		Department = scanner.nextInt();
		
		//Prompt for salary
        System.out.print("Please enter salary: ");
		
		Salary = scanner.nextFloat();
		
		//Prompt for class
        System.out.print("Please enter class (H for Hourly; S for Salary): ");
		
		Class = scanner.next();
		
	/* doesn't work with or or and; goes into look when it is "H" and hangs when it's "g"
		while (Class != "h" && Class != "H" && Class != "s" && Class !="S")
		{
			System.out.print("Please enter only H for Hourly; S for Salary: ");
			scanner.next();	
			Class = scanner.next();
			System.out.println(Class);
		}
	*/		
		
		scanner.close();
		
		//Print out results
		System.out.println("\n Print out data separated by a space");
		System.out.println(Department + " " + Salary + " " +  Class);
		System.out.println("\n Print out data separated by a tab");
		System.out.println(Department + "\t" + Salary  + "\t" + Class);
		System.out.println("\n Print out data separated by a new line");
		System.out.println(Department + "\n" + Salary  + "\n" + Class);



    }
}
