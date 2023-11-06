
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 5 of ICSE 2023 Computer Applications Paper
 */

class Question5 {

    public void print() {
        for( int i=1; i<=5; i++ ) {
            for( int j=1; j<=4; j++ ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void print(int n) {
        int sumOddDigits = 0;
        int sumEvenDigits = 0;

        // extract digits using string
        // n = 3669
        String nStr = "" + n;   // nStr = "3669"
        for( int i=0; i<nStr.length(); i++ ){
            char digitChar = nStr.charAt(i);    // '3', '6', '6', '9'
            int digit = digitChar - '0';
            if( digit%2==0 ) {
                sumEvenDigits += digit;
            }
            else {
                sumOddDigits += digit;
            }
        }
 
        // extract digits using while loop
        // int temp = n;
        // while( n!=0 ) {
        //     int digit = n%10;
        //     n = n/10;
        //     if( digit%2==0 ) {
        //         sumEvenDigits += digit;
        //     }
        //     else {
        //         sumOddDigits += digit;
        //     }
        // }
        // n = temp;

        if( sumEvenDigits==sumOddDigits ) {
            System.out.println(n + " is a lead number");
        }
        else {
            System.out.println(n + " is not a lead number");
        }
    }
}

public class ICSE2023ComputerApplicationsQuestion5 {
    public static void main(String[] args) {
		Question5 question5 = new Question5();
		question5.print();
		question5.print(3669);
	}
}
