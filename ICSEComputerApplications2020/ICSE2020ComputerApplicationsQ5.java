
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 5
 * of ICSE 2020 Computer Applications Boards Paper
 */
import java.util.Scanner;
public class ICSE2020ComputerApplicationsQ5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int integers[] = {31, 36, 45, 50, 60, 75, 86, 90};

        // enter an integer value
        System.out.print("Enter an integer value: ");
        int integer = scanner.nextInt();

        // use binary search to search for this value
        int lo = 0, hi = integers.length-1;
        boolean found = false;
        while( lo<=hi ) {
            int mid = (lo + hi)/2;
            if( integers[mid]==integer ) {
                found = true;
                break;
            }
            else if( integer>integers[mid] ) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        if( found ) {
            System.out.println("Search Successful");
        }
        else {
            System.out.println("Search Unsuccessful");
        }
    }
}
