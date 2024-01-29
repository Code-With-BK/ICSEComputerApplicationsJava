
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 5 of 
 * ICSE 2024 Computer Applications Specimen Paper
 */
import java.util.Scanner;

class Question5 {
    private String string;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = scanner.nextLine();

        // convert string to upper case
        string = string.toUpperCase();
    }

    public void countVowels() {
        // vowels - AEIOU
        int numVowels = 0;
        String vowels = "AEIOU";
        for( int i=0; i<string.length(); i++ ){
            char c = string.charAt(i);
            if( vowels.indexOf(c) != -1 ) {
                numVowels++;
            }
        }
        System.out.println("Number of vowels: " + numVowels);
    }

    public void display() {
        System.out.println("Upper case input string: " + string);
        countVowels();
    }

}

public class ICSE2024ComputerApplicationsSpecimenQ5 {
    public static void main(String args[]) {
        Question5 question5 = new Question5();
        question5.accept();
        question5.display();
    }
}


/*
Alternate code
*/
// public class ICSE2024ComputerApplicationsSpecimenQ5 {
//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String string = scanner.nextLine();

//         // convert string to upper case
//         string = string.toUpperCase();

//         // print the string in upper case
//         System.out.println("Upper case input string: " + string);

//         // count vowels
//         int numVowels = 0;
//         String vowels = "AEIOU";
//         for( int i=0; i<string.length(); i++ ){
//             char c = string.charAt(i);
//             if( vowels.indexOf(c) != -1 ) {
//                 numVowels++;
//             }
//         }
//         System.out.println("Number of vowels: " + numVowels);

//     }
// }
