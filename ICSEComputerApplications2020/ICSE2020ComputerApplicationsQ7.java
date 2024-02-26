
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 7
 * of ICSE 2020 Computer Applications Boards Paper
 */

class Question7 {
    public void Number(int num, int d) {
        int frequency = 0;
        String numStr = "" + num;
        for( int i=0; i<numStr.length(); i++ ) {
            char c = numStr.charAt(i);
            int digit = c - '0';
            if( digit==d ) {
                frequency++;
            }
        }
        System.out.println("Frequency of digit " + d + " in num " + num + " = " + frequency);
    }

    public void Number(int n1) {
        int sumEvenDigits = 0;
        String n1Str = "" + n1;
        for( int i=0; i<n1Str.length(); i++ ) {
            char c = n1Str.charAt(i);
            int digit = c - '0';
            if( digit%2==0 ) {
                sumEvenDigits += digit;
            }
        }
        System.out.println("Sum of even digits in " + n1 + " = " + sumEvenDigits);
    }
}

public class ICSE2020ComputerApplicationsQ7 {
    public static void main(String args[]) {
        Question7 question7 = new Question7();
        question7.Number(2565685, 6);
        question7.Number(1234567);
    }
}
