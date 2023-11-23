/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 4
 * ICSE 2023 Computer Applications Specimen Paper
 */

class Question4 {

    public void print() {
        int count = 1;
        for( int i=1; i<=4; i++ ) {
            for( int j=1; j<=i; j++ ) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public boolean print(int n) {
        int sumOfDigits = 0;

        // 1. Strings
        // String nStr = "" + n;       // n = 512, nStr = "512"
        // for( int i=0; i<nStr.length(); i++ ) {
        //     char c = nStr.charAt(i);        // c = '5', '1', '2'
        //     int digit = c - '0';            // c = '5', c-'0' => '5'-'0' => 53-48 = 5
        //     sumOfDigits += digit;
        // }

        // 2. While loop
        int temp = n;
        while( n!=0 ) {
            int digit = n%10;
            sumOfDigits += digit;
            n = n/10;
        }
        n = temp;

        return (sumOfDigits * sumOfDigits * sumOfDigits) == n;
    }

    public void print(int a, char ch) {
        if( ch=='s' || ch=='S') {
            // print the square of a
            System.out.println(a*a);
        }
        else if( ch=='c' || ch=='C' ) {
            // print the cube of a
            System.out.println(a*a*a);
        }
    }
}
 
public class ICSESpecimen2023ComputerApplicationsQuestion4 {
    public static void main(String args[]) {
        Question4 question4 = new Question4();
		question4.print();
		System.out.println();
		
		int n = 512;
		if( question4.print(n) ) {
			System.out.println(n + " is a Dudeney Number");
		}
		else {
			System.out.println(n + " is not a Dudeney Number");
		}
		System.out.println();
		
		question4.print(10,'c');
    }
}
