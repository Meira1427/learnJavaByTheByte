package examples;

public class ReportCard {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		
		double[] grades = new double[5];
		double total = 0;
		double average = 0;
		int i = 0;
		String name;
		
		System.out.print("Enter the student's name: ");
		name = keyboard.nextLine();
		
		while (i < 5) {
			grades[i] = getCleanGrade((i+1));
			total += grades[i];
			i ++;
		}
		
		average = total/5;
		
		System.out.println("Student " + name + " has an average test score of " + average);
		
	}
	
	public static double getCleanGrade(int number) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter test grade number " + number + " (0 and 100): ");
		while(!scanner.hasNextDouble()) {
			System.out.print("Enter test grade number " + number + " (0 and 100): ");
			scanner.next();
		}
		return scanner.nextDouble();
	}
	

}