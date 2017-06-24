package examples;

public class FiveIntegers 
{
    public static void main(String[] args) 
	{
        //initialize scanner
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		//declare & intialize variables
        int Int1 = 0;
		int Int2 = 0;
		int Int3 = 0;
		int Int4 = 0;
		int Int5 = 0;
		
		//Int1 - Prompt for integer and only accept valid integers
        System.out.print("Please enter an integer: ");
		while(!scanner.hasNextInt())
		{
		System.out.print("Please enter only an integer: ");
		scanner.next();	
		}
		
		Int1 = scanner.nextInt();
		
		// Int2 - I look forward to a way to loop these, but I will do sequentially for now
		System.out.print("Please enter another integer: ");
		while(!scanner.hasNextInt())
		{
		System.out.print("Please enter only an integer: ");
		scanner.next();	
		}
		
		Int2 = scanner.nextInt();
		
		// Int3
		System.out.print("Please enter another integer: ");
		while(!scanner.hasNextInt())
		{
		System.out.print("Please enter only an integer: ");
		scanner.next();	
		}
		
		Int3 = scanner.nextInt();
		
		// Int4
		System.out.print("Please enter yet another integer: ");
		while(!scanner.hasNextInt())
		{
		System.out.print("Please enter only an integer: ");
		scanner.next();	
		}
		
		Int4 = scanner.nextInt();
		
		//Int 5
		System.out.print("(Almost Done) Please enter one more integer: ");
		while(!scanner.hasNextInt())
		{
		System.out.print("Please enter only an integer: ");
		scanner.next();	
		}
		
		Int5 = scanner.nextInt();
		
		//Print out results
		System.out.println("\n Print out numbers separated by a space");
		System.out.println(Int1 + " " + Int2 + " " + Int3 + " " + Int4 + " " + Int5);
		System.out.println("\n Print out numbers separated by a tab");
		System.out.println(Int1 + "\t" + Int2 + "\t" + Int3 + "\t" + Int4 + "\t" + Int5);
		System.out.println("\n Print out numbers separated by a new line");
		System.out.println(Int1 + "\n" + Int2 + "\n" + Int3 + "\n" + Int4 + "\n" + Int5);

        scanner.close();

    }
}
