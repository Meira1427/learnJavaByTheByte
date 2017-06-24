package examples;

public class GiveChange {
	public static void main(String[] args) {
		double amountDue, amountTendered, change;
		
		System.out.print("Enter the amount due: ");
		
		amountDue = GetCleanDouble();
		amountTendered = CheckAmountTendered(amountDue);
		change = amountTendered - amountDue;
		
		System.out.print("Your change is " + amountTendered + " minus " + amountDue);
		System.out.println(" equals " + change);
}
	
	public static double GetCleanDouble () {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while (!scanner.hasNextDouble()) {
			System.out.print("Enter a number please: ");
			scanner.next();
		}
		return scanner.nextDouble();
	}

	public static double CheckAmountTendered (double num) {
		double temp = 0.0;
		while (temp < num) {
			System.out.print("Enter amount tendered: ");
			temp=GetCleanDouble();
		}
		return temp;
	}	
	
}