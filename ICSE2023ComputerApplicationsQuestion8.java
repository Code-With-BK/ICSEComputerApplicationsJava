
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 8 of ICSE 2023 Computer Applications Paper
 */

import java.util.Scanner;

class Question8 {
    private int arr[];
    private int m;

    public Question8() {
        m = 10;
        arr = new int[m];
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for( int i=0; i<m; i++ ) {
            arr[i] = scanner.nextInt();
        }
    }

    public void findSumOneAndTwoDigitNumbers() {
        int sumOneDigitNumbers = 0;
        int sumTwoDigitNumbers = 0;

        for( int i=0; i<m; i++ ){
            int x = arr[i];
            if( x>=0 && x<10 ) {
                sumOneDigitNumbers += x;
            }
            if( x>=10 && x<100 ) {
                sumTwoDigitNumbers += x;
            }
        }

        System.out.println("Sum of one digit numbers: " + sumOneDigitNumbers);
        System.out.println("Sum of two digit numbers: " + sumTwoDigitNumbers);
    }

}

public class ICSE2023ComputerApplicationsQuestion8 {
    public static void main(String args[]) {
		Question8 question8 = new Question8();
		question8.accept();
		question8.findSumOneAndTwoDigitNumbers();
	}
}
