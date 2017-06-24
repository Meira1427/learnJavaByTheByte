package examples;

public class FtoC {
	public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	float userTempF = 0.0F;
	float tempC = 0.0F;
	float conversion = 5/9F;
	
	System.out.print("Enter a temperature in Fahrenheit: ");
	
	while (!scanner.hasNextFloat()){
		System.out.println("A number only. A temperature in Fahrenheit: ");
		scanner.next();
	}
	
	userTempF = scanner.nextFloat();
		
	scanner.close();
	
	tempC = (userTempF -32) * conversion;
	
	System.out.println("\n" + userTempF + " degrees Fahrenheit is " + tempC + " degrees Celsius");
	
	}
}


        