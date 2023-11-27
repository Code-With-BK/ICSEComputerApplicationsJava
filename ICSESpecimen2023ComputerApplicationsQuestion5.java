/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 5
 * ICSE 2023 Computer Applications Specimen Paper
 */

import java.util.Scanner;

class Question5 {

    private int arr[];
    private int m;

    public Question5() {
        m = 10;
        arr = new int[10];
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for( int i=0; i<m; i++ ) {
            int integer = scanner.nextInt();
            arr[i] = integer;
        }
    }

    public void bubbleSort() {
        for( int i=0; i<m; i++ ){
            for( int j=0; j<(m-1); j++ ) {
                if( arr[j]<arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void print() {
        // if arr = {0,1,2} => [ 0 1 2 ]
        System.out.print("[ ");
        for( int i=0; i<m; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}

public class ICSESpecimen2023ComputerApplicationsQuestion5 {
    public static void main(String args[]) {
        Question5 question5 = new Question5();
        question5.accept();
        System.out.print("Original array: ");
        question5.print();
        question5.bubbleSort();
        System.out.print("Sorted array: ");
        question5.print();
    }
}
