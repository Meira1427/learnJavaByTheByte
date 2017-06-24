package examples;

public class Circle2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
	
		//declare variables
		float radius = 0.0F;
		float circumference = 0.0F;
		float area = 0.0F;
		float pi = 3.14F;
	
		System.out.print("Please enter the radius of the circle: ");
		//verifying that we can put it in our float
		while (!scanner.hasNextFloat()) {
			System.out.print("Please enter only a number: ");
			scanner.next();
		}
		//once the number is safe, put it in float
		radius = scanner.nextFloat();
	
		scanner.close();
	
		circumference = 2 * pi * radius;
		area = pi * radius * radius;
	
		System.out.println("\nFor a circle with a radius of " + radius + ", the circumference is " + circumference + " and the area is " + area);
	
	}
}


        