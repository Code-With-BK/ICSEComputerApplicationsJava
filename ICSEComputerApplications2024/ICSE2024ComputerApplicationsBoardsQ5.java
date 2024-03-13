import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 5
 * ICSE 2024 Computer Applications Paper
 */

class Question5 {
	private int n;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		n = scanner.nextInt();
	}
	
	public boolean isPalindrome() {
		String nStr = "" + n;
		int l = nStr.length();
		for( int i=0; i<nStr.length()/2; i++ ) {
			char c1 = nStr.charAt(i);
			char c2 = nStr.charAt(l-i-1);
			if( c1!=c2 ) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isEvenDigitSum() {
		int digitSum = 0;
		String nStr = "" + n;
		for( int i=0; i<nStr.length(); i++ ) {
			int digit = nStr.charAt(i)-'0';
			digitSum += digit;
		}
		return digitSum%2==0;
	}
	
	public void isEvenPal() {
		if( isPalindrome() && isEvenDigitSum() ) {
			System.out.println(n + " is an EvenPal number.");
		}
		else {
			System.out.println(n + " is not an EvenPal number.");
		}
	}
}

public class ICSE2024ComputerApplicationsBoardsQ5 {
	public static void main(String[] args) {
		Question5 question5 = new Question5();
		question5.accept();
		question5.isEvenPal();
	}
}
