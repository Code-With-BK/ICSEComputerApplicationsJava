
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 8
 * of ICSE 2020 Computer Applications Boards Paper
 */
import java.util.Scanner;
public class ICSE2020ComputerApplicationsQ8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // ask the user to enter a choice
        System.out.print("Enter a choice (1 or 2) : ");
        int choice = scanner.nextInt();

        if( choice == 1 ){
            double a;
            final double b = 3.0;
            for( a=1.0; a<=20.0; a+=2.0 ) {
                double c = Math.pow(a,2) + 2*a*b;
                System.out.println("c: " + c);
            }
        }
        else if( choice == 2 ){
            for( int i=0; i<5; i++ ) {
                // print line for each value of i
                for( char ch='A'; ch<=('A'+i); ch++ ) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid choice " + choice);
        }
    }
}
