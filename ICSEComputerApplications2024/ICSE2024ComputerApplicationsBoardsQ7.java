
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 7
 * ICSE 2024 Computer Applications Paper
 */

class pincode {
	private int pincodes[] = { 
		110061, 
		110001, 
		110029, 
		110023, 
		110055, 
		110006, 
		110019, 
		110033
	};
	
	public void selectionSort() {
		int n = pincodes.length;
		for( int i=0; i<n; i++ ) {
			int minPos = i;
			int minimum = pincodes[i];
			for( int j=i+1; j<n; j++ ) {
				if( pincodes[j]<minimum ) {
					minimum = pincodes[j];
					minPos = j;
				}
			}
			
			int temp = pincodes[i];
			pincodes[i] = pincodes[minPos];
			pincodes[minPos] = temp;
		}
	}
	
	public void display() {
		System.out.print("[ ");
		for( int i=0; i<pincodes.length; i++ ) {
			System.out.print(pincodes[i] + " ");
		}
		System.out.println("]");
	}
}

public class ICSE2024ComputerApplicationsBoardsQ7 {
	public static void main(String[] args) {
		pincode pc = new pincode();
		pc.selectionSort();
		pc.display();
	}
}
