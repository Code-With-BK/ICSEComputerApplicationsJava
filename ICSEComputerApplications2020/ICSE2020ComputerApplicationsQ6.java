
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 6
 * of ICSE 2020 Computer Applications Boards Paper
 */
import java.util.Scanner;
public class ICSE2020ComputerApplicationsQ6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // read a sentence
        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine();

        // convert string to upper case
        sentence = sentence.toUpperCase();

        // print words
        String word = "";
        int i = 0;
        while( i<sentence.length() ) {
            char c = sentence.charAt(i);
            // if( c == ' ' ) {
            if( Character.isWhitespace(c) ) {

                // skip the following whitespaces
                while( i<sentence.length() && Character.isWhitespace(c) ) {
                    i++;
                    c = sentence.charAt(i);
                }
                System.out.println(word);
                word = "";
            }
            else {
                word += c;
                i++;
            }
            // i++;
        }
        System.out.println(word);

    }
}
