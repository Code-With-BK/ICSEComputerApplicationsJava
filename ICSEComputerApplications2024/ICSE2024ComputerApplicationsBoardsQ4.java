
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 4
 * ICSE 2024 Computer Applications Paper
 */

class Question4 {
	double perform(double r, double h) {
		double l = Math.sqrt(r*r + h*h);
		double csa = Math.PI * r * l;
		return csa;
	}
	
	void perform(int r, int c) {
		for( int i=1; i<=r; i++ ) {
			for( int j=1; j<=c; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	void perform(int m, int n, char ch) {
		if( ch=='Q' ) {
			int quotient = m/n;
			System.out.println("Quotient of " + m + "/" + n + " = " + quotient);
		}
		else if( ch=='R' ) {
			int remainder = m%n;
			System.out.println("Remainder of " + m + "/" + n + " = " + remainder);
		}
	}
}

public class ICSE2024ComputerApplicationsBoardsQ4 {
	public static void main(String argr[]) {
		Question4 question4 = new Question4();
//		question4.perform(10, 10);
//		System.out.println(question4.perform(3.0, 4.0));
		question4.perform(19, 5, 'Q');
	}
}
