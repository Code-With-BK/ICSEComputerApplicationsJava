/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 6
 * ICSE 2023 Computer Applications Specimen Paper
 */
import java.util.Scanner;

class Question6 {

    private double[] arr;
    private int m;

    public Question6() {
        m = 20;
        arr = new double[m];
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 20 double-type values: ");
        for( int i=0; i<m; i++ ) {
            double x = scanner.nextDouble();
            arr[i] = x;
        }
    }

    public void printRange() {

        double smallest, largest;

        smallest = arr[0];
        largest = arr[0];
        for( int i=0; i<m; i++ ) {
            // update smallest 
            if( arr[i]<smallest ) {
                smallest = arr[i];
            }

            // update largest
            if( arr[i]>largest ) {
                largest = arr[i];
            }
        }

        double range = largest - smallest;
        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
        System.out.println("Range: " + range);
    }
}

public class ICSESpecimen2023ComputerApplicationsQuestion6 {
    public static void main(String args[]) {
        Question6 question6 = new Question6();
        question6.accept();
        question6.printRange();
    }
}
