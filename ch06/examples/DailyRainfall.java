package examples;

public class DailyRainfall {
	public static void main(String[] args) {
		double[] rainfall = new double[7];
		String[] days = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		double total = 0;
		double average = 0;
		int i = 0;
		
		while (i < 7) {
			rainfall[i] = getRainfall(days[i]);
			total += rainfall[i];
			i ++;
		}
			
		average = total/7;
		average = (Math.floor(average*100)/100);
		i = 0;
		System.out.println("\n\n>>>>>>>>>>>>>>>  Rainfall This Week in Inches  <<<<<<<<<<<<<<<<");
		System.out.println("\tMon\tTue\tWed\tThur\tFri\tSat\tSun");
		while (i < 7) {
			System.out.print("\t" + rainfall[i]);
			i ++;
		}
		
		System.out.println("\n\n*** Total Rainfall ***\t" + total);
		System.out.println("** Average Rainfall **\t" + average);
	}
	
	public static double getRainfall(String day) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Please enter the inches of rain that fell on " + day + ": ");
		while(!scanner.hasNextDouble()) {
			System.out.print("Please enter a number. Inches of rain that fell on " + day + ": ");
			scanner.next();
		}
		return scanner.nextDouble();
	}
}