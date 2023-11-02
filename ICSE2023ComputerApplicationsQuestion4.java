
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 4 of ICSE 2023 Computer Applications Paper
 */
import java.util.Scanner;

class Question4 {
    private char arr[];
    private int m;

    public Question4() {
        m = 10;
        arr = new char[m];
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 space separated characters: ");
        // System.out.print("Enter 10 characters: ");
        // String characters = scanner.next();
        // String characters = scanner.nextLine();
        for( int i=0; i<m; i++ ) {
            String s = scanner.next();
            char ch = s.charAt(0);
            // char ch = characters.charAt(i);
            arr[i] = ch;
        }
    }

    public void sort() {
        for( int i=0; i<m; i++ ) {
            for( int j=0; j<(m-1); j++ ) {
                if( arr[j]>arr[j+1] ) {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void display() {
        // {0,1,2,3} => [ 0 1 2 3 ]
        System.out.print("[ ");
        for( int i=0; i<m; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

}

public class ICSE2023ComputerApplicationsQuestion4 {
    public static void main(String args[]) {
        Question4 question4 = new Question4();
		question4.accept();
		System.out.print("Original Array: ");
		question4.display();
		question4.sort();
		System.out.print("Sorted Array: ");
		question4.display();
    }
}
