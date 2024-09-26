import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 3 
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Bank {
	private double p;
	private double n;
	private double r;
	private double a;
	
	// not adding a constructor, becase this is not part of the requirement
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		// input amount 
		System.out.print("Input principal amount: ");
		p = scanner.nextDouble();
		
		// input time in years 
		System.out.print("Input time in years: ");
		n = scanner.nextDouble();
	}
	
	public void calculate() {
		// calculate rate
		if( n<=0.5 ) {
			r = 9;
		}
		else if( n<=1 ) {
			r = 10;
		}
		else if( n<=3 ) {
			r = 11;
		}
		else {
			r = 12;
		}
		
		// calculate a
		a = p*(Math.pow(1 + r/100.0, n));
	}
	
	public void display() {
		// print headers
		System.out.printf("%-15s %-10s %-10s %-10s\n", "Principal","Time","Rate","Amount");
		// print values
		System.out.printf("%-15s %-10s %-10s %-10s\n", "Rs. " + p, n + " years", r + "%","Rs. " + String.format("%.2f",a));
	}
}

public class ICSE2025SpecimenQ3 {
	
	public static void main(String arg[]) {
		Bank bank = new Bank();
		bank.accept();
		bank.calculate();
		bank.display();
	}

}
