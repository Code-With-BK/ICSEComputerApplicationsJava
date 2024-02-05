
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 7 of 
 * ICSE 2024 Computer Applications Specimen Paper
 */
import java.util.Scanner; 

class Question7 {
    private int number;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        number = scanner.nextInt();
    }
    
    public void checkDuckNumber() {
        String numberString = "" + number;
        int numDigits = numberString.length();
        if( numDigits==3 ) {
            // check if this contains a 0
            boolean hasZero = false;
            for( int i=0; i<numberString.length(); i++ ) {
                char c = numberString.charAt(i);
                if( c=='0' ) {
                    hasZero = true;
                }
            }
            if( hasZero ) {
                System.out.println("Duck number");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}

public class ICSE2024ComputerApplicationsSpecimenQ7 {
    public static void main(String args[]) {
        Question7 question7 = new Question7();
        question7.accept();
        question7.checkDuckNumber();
    }
}

/*
Alternate code
*/

// public class ICSE2024ComputerApplicationsSpecimenQ7 {
//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a 3-digit number: ");
//         int number = scanner.nextInt();

//         String numberString = "" + number;
//         int numDigits = numberString.length();
//         if( numDigits==3 ) {
//             // check if this contains a 0
//             boolean hasZero = false;
//             for( int i=0; i<numberString.length(); i++ ) {
//                 char c = numberString.charAt(i);
//                 if( c=='0' ) {
//                     hasZero = true;
//                 }
//             }
//             if( hasZero ) {
//                 System.out.println("Duck number");
//             }
//             else {
//                 System.out.println("Invalid");
//             }
//         }
//         else {
//             System.out.println("Invalid");
//         }
//     }
// }