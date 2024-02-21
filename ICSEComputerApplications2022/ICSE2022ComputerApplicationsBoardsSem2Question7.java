
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 7 of ICSE 2022
 * Computer Applications Boards Semester 2 Paper
 */
import java.util.Scanner;

class Question7 {
    String string1;
    String string2;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        string1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        string2 = scanner.nextLine();

        // check for same lengths
        if( string1.length() != string2.length() ) {
            System.out.println("Input strings are not of same length!");
            System.exit(0);
        }
    }

    public void formNewWord() {
        String newWord = "";
        for( int i=0; i<string1.length(); i++ ) {
            newWord += string1.charAt(i);
            newWord += string2.charAt(i);
        }
        System.out.println(newWord);
    }
}
public class ICSE2022ComputerApplicationsBoardsSem2Question7 {
    public static void main(String args[]) {
        Question7 q7 = new Question7();
        q7.accept();
        q7.formNewWord();
    }
}
