
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 5 of ICSE 2022
 * Computer Applications Boards Semester 2 Paper
 */
import java.util.Scanner;
class Question5 {
    String string;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = scanner.nextLine();
    }

    public void reverseCases() {
        for( int i=0; i<string.length(); i++ ) {
            char c= string.charAt(i);
            if( Character.isLowerCase(c) ) {
                c = Character.toUpperCase(c);
                System.out.print(c);
            }
            else if( Character.isUpperCase(c) ) {
                c = Character.toLowerCase(c);
                System.out.print(c);
            }
            else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}

public class ICSE2022ComputerApplicationsBoardsSem2Question5 {
    public static void main(String arrgs[]) {
        Question5 q5 = new Question5();
        q5.accept();
        q5.reverseCases();
    }
}
