package examples;

public class NextLargestMultiple {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
	
		//declare variables
		int i = 0;
		int j = 0;
		int NextMultiple = 0;
	
		System.out.print("Enter an integer: ");
	
		while (!scanner.hasNextInt()) {
			System.out.print("Please enter only an integer: ");
			scanner.next();
		}
	
		i = scanner.nextInt();
	
		System.out.print("Enter another integer: ");
	
		while (!scanner.hasNextInt()) {
			System.out.print("Please enter only an integer: ");
			scanner.next();
		}
	
		j = scanner.nextInt();
	
		scanner.close();
	
		NextMultiple = i + j - i % j;
	
		System.out.println("For " + i + " and " + j + " the next largest multiple is " + NextMultiple);

	}
}
	