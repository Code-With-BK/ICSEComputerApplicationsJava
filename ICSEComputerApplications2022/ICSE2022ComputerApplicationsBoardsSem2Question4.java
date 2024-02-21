
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 4 of ICSE 2022
 * Computer Applications Boards Semester 2 Paper
 */
import java.util.Scanner;

class Question4 {
    double arr[];

    public Question4() {
        arr = new double[20];
    }

    public void accept(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 double type values: ");
        for( int i=0; i<20; i++ ) {
            arr[i] = scanner.nextDouble();
        }
    }

    public void printProduct() {
        double p=1;
        for( int i=0; i<20; i++ ) {
            p *= arr[i];
        }
        System.out.println("Product of the values: " + p);
    }

    public void printSquares() {
        System.out.println("Square of each element: ");
        for( int i=0; i<20; i++ ) {
            System.out.println("Sqaure of " + arr[i] + " = " + (Math.pow(arr[i],2)));
        }
    }
}

public class ICSE2022ComputerApplicationsBoardsSem2Question4 {
    public static void main(String args[]) {
        Question4 question4 = new Question4();
        question4.accept();
        question4.printProduct();
        question4.printSquares();
    }
}
