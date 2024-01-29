
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 6 of 
 * ICSE 2024 Computer Applications Specimen Paper
 */
import java.util.Scanner;

class Question6 {
    private int arr[][];
    private int size;

    public Question6() {
        size = 3;
        arr = new int[3][3];
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 9 integer values: ");
        for( int i=0; i<size; i++ ) {
            for( int j=0; j<size; j++ ) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public void checkSpecialArray() {
        int sumEvenElements = 0;
        int sumOddElements = 0;
        for( int i=0; i<size; i++ ) {
            for( int j=0; j<size; j++ ) {
                if( arr[i][j]%2==0 ) {
                    sumEvenElements += arr[i][j];
                }
                else {
                    sumOddElements += arr[i][j];
                }
            }
        }

        // System.out.println("Sum of even elements: " + sumEvenElements);
        // System.out.println("Sum of odd elements: " + sumOddElements);

        if( sumEvenElements==sumOddElements ) {
            System.out.println("This is a special array!");
        }
        else {
            System.out.println("This is not a special array!");
        }
    }

}
public class ICSE2024ComputerApplicationsSpecimenQ6 {
    public static void main(String args[]) {
        Question6 question6 = new Question6();
        question6.accept();
        question6.checkSpecialArray();
    }
}

/*
Alternate code 
*/

// public class ICSE2024ComputerApplicationsSpecimenQ6 {
//     public static void main(String args[]) {
//         int size = 3;
//         int[][] arr = new int[3][3];


//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter 9 integer values: ");
//         for( int i=0; i<size; i++ ) {
//             for( int j=0; j<size; j++ ) {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         int sumEvenElements = 0;
//         int sumOddElements = 0;
//         for( int i=0; i<size; i++ ) {
//             for( int j=0; j<size; j++ ) {
//                 if( arr[i][j]%2==0 ) {
//                     sumEvenElements += arr[i][j];
//                 }
//                 else {
//                     sumOddElements += arr[i][j];
//                 }
//             }
//         }

//         System.out.println("Sum of even elements: " + sumEvenElements);
//         System.out.println("Sum of odd elements: " + sumOddElements);

//         if( sumEvenElements==sumOddElements ) {
//             System.out.println("This is a special array!");
//         }
//         else {
//             System.out.println("This is not a special array!");
//         }
//     }
// }