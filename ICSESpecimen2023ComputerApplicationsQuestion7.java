/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 7
 * ICSE 2023 Computer Applications Specimen Paper
 */

import java.util.Scanner;

class Question7 {

    private String string;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = scanner.nextLine();
    }

    public void reverse() {
        String reverse = "";

        for( int i=string.length()-1; i>=0; i--) {
            char c = string.charAt(i);
            reverse += c;
        }

        System.out.println("Reverse of \"" + string + "\" is \"" + reverse + "\"");
    }

    public void countVowels() {
        int numVowels = 0;
        String vowels = "aeiouAEIOU";
        for( int i=0; i<string.length(); i++ ) {
            char c = string.charAt(i);
            if( vowels.indexOf(c) != -1 ) {
                numVowels++;
            }
        }
        System.out.println("Number of vowels in \"" + string + "\" are " + numVowels);
    }
}

public class ICSESpecimen2023ComputerApplicationsQuestion7 {
    public static void main(String args[]) {
        Question7 question7 = new Question7();
        question7.accept();
        question7.reverse();
        question7.countVowels();
    }
}
