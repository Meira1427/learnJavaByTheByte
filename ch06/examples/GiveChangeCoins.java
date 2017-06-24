package examples;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GiveChangeCoins {
	public static void main(String[] args) {
		double amountDue, amountTendered;
		BigDecimal num20, num10, num5, num1, numQuarter, numDime, numNickel, numPenny, leftover, tocheck;
		
		BigDecimal twenty = new BigDecimal("20.00");
		BigDecimal ten = new BigDecimal("10.00");
		BigDecimal five = new BigDecimal("5.00");
		BigDecimal one = new BigDecimal("1.00");
		BigDecimal quarter = new BigDecimal("0.25");
		BigDecimal dime = new BigDecimal("0.10");
		BigDecimal nickel = new BigDecimal("0.05");
		BigDecimal penny = new BigDecimal("0.01");
		
		System.out.print("Enter the amount due: ");
		
		amountDue = GetCleanDouble();
		amountTendered = CheckAmountTendered(amountDue);
		BigDecimal change = BigDecimal.valueOf(amountTendered - amountDue).setScale(2, RoundingMode.HALF_UP);
		
		num20 = MakeChange(change, twenty);
		leftover = change.subtract(num20.multiply(twenty)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		num10 = MakeChange(leftover, ten);
		leftover = leftover.subtract(num10.multiply(ten)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		num5 = MakeChange(leftover, five);
		leftover = leftover.subtract(num5.multiply(five)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		num1 = MakeChange(leftover, one);
		leftover = leftover.subtract(num1.multiply(one)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		numQuarter = MakeChange(leftover, quarter);
		leftover = leftover.subtract(numQuarter.multiply(quarter)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		numDime = MakeChange(leftover, dime);
		leftover = leftover.subtract(numDime.multiply(dime)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		numNickel = MakeChange(leftover, nickel);
		leftover = leftover.subtract(numNickel.multiply(nickel)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		numPenny = MakeChange(leftover, penny);
		leftover = leftover.subtract(numPenny.multiply(penny)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(leftover);
		
		tocheck = (num20.multiply(twenty)).add(num10.multiply(ten)).add(num5.multiply(five)).add(num1.multiply(one)).add(numQuarter.multiply(quarter)).add(numDime.multiply(dime)).add(numNickel.multiply(nickel)).add(numPenny.multiply(penny));		
		
		System.out.println("Your change is " + change);
		System.out.println("Verifying number" + tocheck);
		System.out.println("Number of 20s returned is " + num20);
		System.out.println("Number of 10s returned is " + num10);
		System.out.println("Number of 5s returned is " + num5);
		System.out.println("Number of 1s returned is " + num1);
		System.out.println("Number of Quarters returned is " + numQuarter);
		System.out.println("Number of Dimes returned is " + numDime);
		System.out.println("Number of Nickels returned is " + numNickel);
		System.out.println("Number of Pennies returned is " + numPenny);
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
		double temp = 0;
		while (temp < num) {
			System.out.print("Enter amount tendered: ");
			temp=GetCleanDouble();
		}
		return temp;
	}
	
	public static BigDecimal MakeChange(BigDecimal amount, BigDecimal currency) {
		BigDecimal temp = new BigDecimal("0");
		if (amount.doubleValue() < currency.doubleValue()) {
			return temp;
		}
		else {
			return amount.divide(currency).setScale(0, RoundingMode.FLOOR);
		}
	}
	

}
