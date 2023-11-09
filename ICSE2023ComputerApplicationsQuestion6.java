
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 6 of ICSE 2023 Computer Applications Boards Paper
 */
import java.util.Scanner;

class Question6 {
    private String string;

    public void accept() {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = scanner.nextLine();
    }

    public void countChars() {
        int numDigits = 0;
        int numAlphabets = 0;
        int numSpecialCharacters = 0;

        for( int i=0; i<string.length(); i++ ) {
            char ch = string.charAt(i);
            // if( Character.isDigit(ch) ) {
            if( ch>='0' && ch<='9' ) {
                numDigits++;
            }
            // else if( Character.isLetter(ch) ) {
            else if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ) {
                numAlphabets++;
            }
            else {
                numSpecialCharacters++;
            }
        }

        System.out.println("Number of digits: " + numDigits);
        System.out.println("Number of alphabets: " + numAlphabets);
        System.out.println("Number of special characters: " + numSpecialCharacters);
    }
}

public class ICSE2023ComputerApplicationsQuestion6 {
    public static void main(String[] args) {
		Question6 question6 = new Question6();
		question6.accept();
		question6.countChars();
	}
}
