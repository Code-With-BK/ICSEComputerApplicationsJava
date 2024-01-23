
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 4 of 
 * ICSE 2024 Computer Applications Specimen Paper
 */
import java.util.Scanner;
class Question4 {

    private int arr[];

    public Question4() {
        arr = new int[10];
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for( int i=0; i<10; i++ ) {
            arr[i] = scanner.nextInt();
        }
    }

    public void sort() {
        for( int i=0; i<arr.length; i++ ) {
            int minPos = i;
            int minVal = arr[i];
            for( int j=i+1; j<arr.length; j++ ) {
                if( arr[j]<minVal ) {
                    minVal = arr[j];
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public void display() {
        System.out.print("[ ");
        for( int i=0; i<arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    
}

public class ICSE2024ComputerApplicationsSpecimenQ4 {
    public static void main(String args[]) {
        Question4 question4 = new Question4();
        question4.accept();
        System.out.print("Original array: ");
        question4.display();
        question4.sort();
        System.out.print("Sorted array: ");
        question4.display();
    }
}

/*
Alternate code
*/
// public class ICSE2024ComputerApplicationsSpecimenQ4 {
//     public static void main(String args[]) {
//         int arr[];
//         arr = new int[10];

//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter 10 integers: ");
//         for( int i=0; i<10; i++ ) {
//             arr[i] = scanner.nextInt();
//         }

//         System.out.print("Original array: ");
//         System.out.print("[ ");
//         for( int i=0; i<arr.length; i++ ) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("]");


//         for( int i=0; i<arr.length; i++ ) {
//             int minPos = i;
//             int minVal = arr[i];
//             for( int j=i+1; j<arr.length; j++ ) {
//                 if( arr[j]<minVal ) {
//                     minVal = arr[j];
//                     minPos = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[minPos];
//             arr[minPos] = temp;
//         }

//         System.out.print("Sorted array: ");
//         System.out.print("[ ");
//         for( int i=0; i<arr.length; i++ ) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("]");
//     }
// }