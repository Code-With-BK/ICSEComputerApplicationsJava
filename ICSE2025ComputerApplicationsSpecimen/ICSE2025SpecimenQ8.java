
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 38
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Question8 {
	
	public void display() {
		for( int i=0; i<3; i++ ) {
			for( int j=0; j<5; j++ ) {
				// for even value of j, print 1
				if( j%2==0 ) {
					System.out.print("1 ");
				}
				// for odd value of j, print 2
				else {
					System.out.print("2 ");
				}
			}
			System.out.println();
		}
	}
	
	public void display(int n, int m) {
		// if m is greater than n 
		if( m>n ) {
			// print the quotient of the division of m and n
			int quotient = m/n;
			System.out.println("Quotient " + m + "/" + n + " = " + quotient);
		}
		// otherwise
		else {
			// print the sum of twice n and thrice m 
			int sum = 2*n + 3*m;
			System.out.println("(2 x " + n + ") + (3 x " + m + ") = " + sum);
		}
	}
	
	public void display(double a, double b, double c) {
		double p = (a+b)/c;
		double q = a+b+c;
		double z = p*q;
		System.out.println("z = " + z);
	}
}

public class ICSE2025SpecimenQ8 {
	public static void main(String args[]) {
		Question8 question8 = new Question8();
		// display()
		question8.display();
		System.out.println();
		
		// display(int, int)
		int m = 10;
		int n = 32;
		question8.display(n, m);
		System.out.println();
		
		// display(double, double, double)
		double a = 3;
		double b = 3;
		double c = 2;
		question8.display(a, b, c);
	}
}
