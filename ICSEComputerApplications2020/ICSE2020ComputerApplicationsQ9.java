
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 9
 * of ICSE 2020 Computer Applications Boards Paper
 */
import java.util.Scanner;

public class ICSE2020ComputerApplicationsQ9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // read 9 values into a 2D array of size 3x3
        int[][] arr=new int[3][3];
        System.out.println("Enter 9 integer values: ");
        for( int i=0; i<3; i++ ) {
            for( int j=0; j<3; j++ ) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // find sum of left diagonal elements
        int sumLeftDiagonal = 0;
        for( int i=0; i<3; i++ ) {
            sumLeftDiagonal += arr[i][i];
        }

        // print
        System.out.println("Sum of the left diagonal elements = " + sumLeftDiagonal);
    }
}
