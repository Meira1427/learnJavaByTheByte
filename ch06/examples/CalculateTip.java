package examples;

public class CalculateTip {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
	
		//declare variables
		float totalBill = 0.0F;
		float tip10 = 0.0F;
		float tip15 = 0.0F;
		float tip20 = 0.0F;
	
		System.out.print("Enter amount of bill: ");
	
		while (!scanner.hasNextFloat()) {
			System.out.print("Please enter correct amount: ");
			scanner.next();
		}
	
		totalBill = scanner.nextFloat();
		
		scanner.close();
		
		tip10 = totalBill*0.10F;
		tip15 = totalBill*0.15F;
		tip20 = totalBill*0.20F;
		
		System.out.println("Thank you for the information. Your tip will be:");
		System.out.println("10% = " + tip10);
		System.out.println("15% = " + tip15);
		System.out.println("20% = " + tip20);

	}
}
	