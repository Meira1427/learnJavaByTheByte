package examples;

public class Divide {
	public static void main(String[] args) {

	int dividend, divisor;
	double answer;
	
	System.out.print("Enter the dividend (larger number): ");
	dividend = GetCleanInt();
	
	divisor = GetDivisor(dividend);
	
	answer = dividend/divisor;
	
	System.out.println(dividend + " divided by " + divisor + " is equal to " + answer);
	}
	
	public static int GetCleanInt () {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while (!scanner.hasNextInt()) {
			System.out.print("Enter an integer please: ");
			scanner.next();
		}
		return scanner.nextInt();
	}
	
	public static int GetDivisor (int num) {
		int temp = 0;
		while (temp > num || temp == 0){
			System.out.print("Enter an integer smaller than your dividend and not equal to zero: ");
			temp = GetCleanInt();
		}
		return temp;
	}
			
}