
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 8 of 
 * ICSE 2024 Computer Applications Specimen Paper
 */

class Question8 {
    
    public void display() {
        for( int i=1; i<=5; i++ ) {
            // print from 1 to i
            for( int j=1; j<=i; j++ ) {
                System.out.print(j + " ");
            }
            // change line
            System.out.println();
        }
    }

    public void display(int n) {
        // 1. using strings
        String nString = "" + n;        // n=4329, nString="4329"
        for( int i=nString.length()-1; i>=0; i-- ) {
            char c = nString.charAt(i);     // c='9', '2', '3', '4'
            int digit = c - '0';        // '0' -> 48, '1' -> 49, '2' -> 50
            double squareRoot = Math.sqrt(digit);
            // String s = String.format("%.9f",squareRoot);
            System.out.println(squareRoot);
            // System.out.println(s);
        }

        // 2. using loops
        // while( n!=0 ) {
        //     int digit = n%10;
        //     n = n/10;
        //     double squareRoot = Math.sqrt(digit);
        //     System.out.println(squareRoot);
        // }
    }
}

public class ICSE2024ComputerApplicationsSpecimenQ8 {
    public static void main(String args[]) {
        Question8 question8 = new Question8();
        question8.display();
        System.out.println();
        int n = 4329;
        question8.display(n);
    }
}
