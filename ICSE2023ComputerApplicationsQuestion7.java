
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 7 of ICSE 2023 Computer Applications Paper
 */
import java.util.Scanner;

class Question7 {
    private double arr[];
    private int m;
    private Scanner scanner;

    public Question7() {
        m = 20;
        arr = new double[m];
        scanner = new Scanner(System.in);
    }

    public void accept() {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 20 double-type values: ");
        for( int i=0; i<m; i++ ) {
            double x = scanner.nextDouble();
            arr[i] = x;
        }
    }

    public void search() {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double-type value to search: ");
        double searchItem = scanner.nextDouble();

        int index = -1;
        for( int i=0; i<m; i++ ) {
            // if( arr[i] == searchItem ) {
            if( Double.compare(arr[i], searchItem) == 0 ) {
                index = i;
            }
        }

        if( index==-1 ) {
            System.out.println("not found");
        }
        else {
            System.out.println("Found");
            System.out.println("Position: " + index);
        }
    }
}

public class ICSE2023ComputerApplicationsQuestion7 {
    public static void main(String[] args) {
		Question7 question7 = new Question7();
		question7.accept();
		question7.search();
	}
}
