
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 6 of ICSE 2022
 * Computer Applications Boards Semester 2 Paper
 */
import java.util.Scanner;
class Question6 {
    String arr[];

    public Question6() {
        arr = new String[10];
    }

    public void accept(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 words (each on a separate line) : ");
        for( int i=0; i<10; i++ ){
            arr[i] = scanner.nextLine();
        }
    }

    public void printNames() {
        System.out.println("Names starting and ending with 'A'/'a': ");
        for( int i=0; i<10; i++ ){
            String name = arr[i];
            char firstLetter = name.charAt(0);
            char lastLetter = name.charAt(name.length()-1);
            firstLetter = Character.toLowerCase(firstLetter);
            lastLetter = Character.toLowerCase(lastLetter);
            if( firstLetter=='a' && lastLetter=='a' ) {
                System.out.println(name);
            }
        }
    }
}

public class ICSE2022ComputerApplicationsBoardsSem2Question6 {
    public static void main(String args[]) {
        Question6 q6 = new Question6();
        q6.accept();
        q6.printNames();
    }
}
