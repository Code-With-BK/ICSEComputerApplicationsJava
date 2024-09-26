import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 5
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Question5 {
	
	private String str;
	private String newstr;
	
	// optionally add a constructor and set each string to blank
	// by default, they will be null
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		// ask the user to input a string
		System.out.print("Enter a string: ");
		str = scanner.nextLine();
	}
	
	public void convert() {
		newstr = "";
		
		// convert the original string to upper case first
		String strUC = str.toUpperCase();
		for( int i=0; i<strUC.length(); i++ ) {
			char ch = strUC.charAt(i);
			// if this is a vowel
			if( ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' ) {
				// find the next character after this vowel
				char nextChar = (char)(ch + 1);
				newstr += nextChar;
			}
			// else if this is a consonant
			else if( ch>='A' && ch<='Z' ) {
				// find the previous characters
				char prevChar = (char)(ch - 1);
				newstr += prevChar;
			}
			// else add the characters as it is
			else {
				newstr += ch;
			}
		}
	}
	
	public void display() {
		// show original string
		System.out.println("Original string  : " + str);
		System.out.println("Converted string : " + newstr);
	}
}

public class ICSE2025SpecimenQ5 {

	public static void main(String[] args) {
		Question5 question5 = new Question5();
		question5.accept();
		question5.convert();
		question5.display();
	}

}
