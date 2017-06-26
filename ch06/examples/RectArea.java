package examples;

public class RectArea {
	public static void main(String[] args) {
		int leftX, leftY, rightX, rightY;
		int length, height;
		double area;
		
		leftX = getCoordinate("X Coordinate, upper left corner of rectangle,", -1);
		leftY = getCoordinate("Y Coordinate, upper left corner of rectangle,", -1);
		rightX = getCoordinate("X Coordinate, bottom right corner of rectangle,", -1);
		rightY = getCoordinate("Y Coordinate, bottom right corner of rectangle,", -1);
		
		length = rightX - leftX;
		height = rightY - leftY;
		area = length*height;
		
		System.out.print("\nThe area of triangle (" + leftX + ", " + leftY + ") and (");
		System.out.println(rightX + ", " + rightY + ") is " + area);
	}
	
	public static int getCleanInt(String prompt){
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("Enter the " + prompt + " (a positive integer only): ");
		while(!scanner.hasNextInt()) {
			System.out.print("Enter the " + prompt + " (a positive integer only): ");
			scanner.next();
		}
		return scanner.nextInt();
	}
	
	public static int getCoordinate(String prompt, int number) {
		while (number < 0) {
			number = getCleanInt(prompt);
		}
		return number;
	}
			
}