import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 7
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */ 

class Question7 {
	
	// the integer to check for SUPERSPY number
	private int n;
	
//	public Question7(int nn) {
//		n = nn;
//	}
	
	// method to accept an integer from the user
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter an integer
		System.out.print("Enter an integer: ");
		n = scanner.nextInt();
	}
	
	// method to get the number of digits in n
	public int getNumDigits() {
		return ("" + n).length();
	}
	
	// method to get the sum of digits in n
	public int getDigitsSum() {
		int digitSum = 0;
		String nStr = "" + n;		// n = 1021, nStr = "1021"
		for( int i=0; i<nStr.length(); i++ ) {
			char ch = nStr.charAt(i);	// ch = '1', '0', '2', '1'
			int digit = ch - '0';	// '0' -> 48, '1' -> 49, '2' -> 50
			digitSum += digit;
		}
		return digitSum;
	}
	
	// method to check if n is a SUPERSPY number
	public boolean isSUPERSPY() {
		return getDigitsSum() == getNumDigits();
	}
	
	private void printAdditionOfDigits() {
		String nStr = "" + n;	
		for( int i=0; i<nStr.length(); i++ ) {
			char ch = nStr.charAt(i);
			System.out.print(ch);
			if( i+1<nStr.length() ) {
				System.out.print("+");
			}
		}
	}
	
	// method to display
	public void display() {
		if( isSUPERSPY() ) {
			System.out.print("SUPERSPY number");
			System.out.print("[SUM OF THE DIGITS = ");
			printAdditionOfDigits();
			System.out.println(" = " + getDigitsSum() + ",");
			System.out.println("                NUMBER OF DIGITS = " + getNumDigits() + "]");
		}
		else {
			System.out.print("Not an SUPERSPY number");
			System.out.print("[");
			printAdditionOfDigits();
			System.out.println(" is not equal to " + getNumDigits() + "]");
		}
	}
}

public class ICSE2025SpecimenQ7 {
	public static void main(String[] args) {
		Question7 question7 = new Question7();
		question7.accept();
		question7.display();
	}
}
