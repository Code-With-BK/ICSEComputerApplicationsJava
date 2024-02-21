
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 3 of ICSE 2022
 * Computer Applications Boards Semester 2 Paper
 */
import java.util.Scanner;

class Question3 {
    char arr[];

    public Question3() {
        arr = new char[10];
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 characters (space separated): ");
        for( int i=0; i<10; i++ ) {
            arr[i] = scanner.next().charAt(0);
        }
    }

    public void display() {
        char lowest = arr[0];
        char highest = arr[0];
        for( int i=1; i<10; i++ ) {
            if( lowest>arr[i] ) {
                lowest = arr[i];
            }
            if( highest<arr[i] ) {
                highest = arr[i];
            }
        }
        System.out.println("Character with highest ASCII value = " + highest);
        System.out.println("Character with lowest ASCII value = " + lowest);
    }
}

public class ICSE2022ComputerApplicationsBoardsSem2Question3 {
    public static void main(String args[]) {
        Question3 question3 = new Question3();
        question3.accept();
        question3.display();
    }
}
