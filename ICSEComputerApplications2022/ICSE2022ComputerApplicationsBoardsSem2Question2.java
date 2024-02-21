
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 2 of ICSE 2022
 * Computer Applications Boards Semester 2 Paper
 */

import java.util.Scanner; 

public class ICSE2022ComputerApplicationsBoardsSem2Question2 {
    public static void main(String args[]) {
        int arr[] = {2, 5, 7,10,15, 20, 29, 30, 46, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search: ");
        int x = scanner.nextInt();

        int lo = 0;
        int hi = arr.length-1;
        int index = -1;
        while( lo<=hi ) {
            int mid = (lo + hi)/2;
            if( arr[mid]==x ) {
                index = mid;
                break;
            }
            else if( x<arr[mid] ) {
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }

        if( index!=-1 ) {
            System.out.println("element " + x + " found at index " + index);
        }
        else {
            System.out.println("Search element not found");
        }

    }
}
