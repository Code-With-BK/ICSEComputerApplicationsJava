import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 6
 * ICSE 2024 Computer Applications Paper
 */

class Question6 {
	private int arr[][];
	
	public Question6() {
		arr = new int[4][4];
	}
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4x4 integer values: ");
		for( int i=0; i<4; i++ ) {
			for( int j=0; j<4; j++ ) {
				arr[i][j] = scanner.nextInt();
			}
		}
	}
	
	public void checkDiagonalArray() {
		int sumLeftDiagonal = 0;
		int sumRightDiagonal = 0;
		for( int i=0; i<4; i++ ) {
			for( int j=0; j<4; j++ ) {
				// left diagonal is i==j
				if( i==j ) {
					sumLeftDiagonal += arr[i][j];
				}
				if( i+j==(3) ) {
					sumRightDiagonal += arr[i][j];
				}
			}
		}
		if( sumLeftDiagonal == sumRightDiagonal ) {
			System.out.println("DIAGONAL ARRAY");
		}
		else {
			System.out.println("NOT A DIAGONAL ARRAY");
		}
	}
}

public class ICSE2024ComputerApplicationsBoardsQ6 {
	public static void main(String[] args) {
		Question6 question6 = new Question6();
		question6.accept();
		question6.checkDiagonalArray();
	}
}
