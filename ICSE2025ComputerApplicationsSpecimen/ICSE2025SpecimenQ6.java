import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 6
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */ 

class Question6 {
	
	// the data member to store the 2D int array
	private int[][] arr;
	
	// the data member to store the size
	private static final int SIZE = 4;
	
	// default constructor
	public Question6() {
		// size = 4;
		
		// create the array
		arr = new int[SIZE][SIZE];
	}
	
	// method to accept values into this 2D array
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter values for each row
		for( int i=0; i<SIZE; i++ ) {
			// ask the user to enter 4 integers for this row
			System.out.print("Enter 4 integers for row " + (i+1) + " : ");
			for( int j=0; j<SIZE; j++ ) {
				arr[i][j] = scanner.nextInt();
			}
		}
	}
	
	// method to find the sum of a row
	public int findRowSum(int row[]) {
		// sum all the values in this row
		int sum = 0;
		for( int i : row ) {
			sum += i;
		}
		return sum;
	}
	
	// method to print the sum of all rows
	public void printRowSums() {
		// for each row
		for( int i=0; i<SIZE; i++ ) {
			// find the sum
			int rowSum = findRowSum(arr[i]);
			// print the sum
			System.out.print("sum of row " + (i+1) + " = " + rowSum);
			
			// print the values of the row in the ()
			System.out.print("(");
			for( int j=0; j<SIZE; j++ ) {
				System.out.print(arr[i][j]);
				if( j+1<SIZE ) {
					System.out.print("+");
				}
			}
			System.out.println(")");
		}
	}
}

public class ICSE2025SpecimenQ6 {
	public static void main(String[] args) {
		Question6 question6 = new Question6();
		question6.accept();
		System.out.println();
		question6.printRowSums();
	}
}
