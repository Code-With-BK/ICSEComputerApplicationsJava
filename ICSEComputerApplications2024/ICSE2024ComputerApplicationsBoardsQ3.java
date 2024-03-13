import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 3 
 * ICSE 2024 Computer Applications Paper
 */

class courier {
	private String name;
	private double weight;
	private String address;
	private double bill;
	private char type;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter weight: ");
		weight = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Enter address: ");
		address = scanner.nextLine();
		
		System.out.print("Enter type: ");
		type = scanner.nextLine().charAt(0);
		
	}
	
	public void calculate() {
		bill = 0;
		if( weight<=5 ) {
			bill = 800*weight;
		}
		else if( weight<=10 ) {
			bill = 800*5 + 700*(weight-5); 
		}
		else {
			bill = 800*5 + 700*5 + 500*(weight-10);
		}
		
		if( type=='I' ) {
			bill += 1500;
		}
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Weight: " + weight + " kgs");
		System.out.println("Address: " + address);
		System.out.println("Type: " + type);
		System.out.println("Bill: Rs." + bill);
	}
	
	void main() {
		courier c=new courier();
		c.accept();
		c.calculate();
		c.print();
	}
}

public class ICSE2024ComputerApplicationsBoardsQ3 {
	public static void main(String[] args) {
		courier c = new courier();
		c.main();
	}
}
