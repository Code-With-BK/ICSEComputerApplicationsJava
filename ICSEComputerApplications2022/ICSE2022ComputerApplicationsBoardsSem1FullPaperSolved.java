/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solutions for all questions of ICSE 2022
 * Computer Applications Boards Semester 1 Paper
 */

import java.util.*; // Q8 (i)

class Number {  // (i)
	void Display(int n) {
		while( n>0 ) {  // (ii)
			int rem = n%10; // (iii)
			System.out.println(rem);
			n = n/10; // (iv)
		}
	}
	
	void Display() {
		for( double x=0.5; x<=5.0; x+=0.5) {	// (v), (vi)
			System.out.println(x);
		}
	}
	
	void abundant(int n) {
		int s = 0;
		for( int i=1; i<n; i++ ) { // i) ,ii)
			if( n%i==0 ) { // iii)
				s = s+i;
			}
		}
		if( s>n )  // iv)
			System.out.println("Abundant Number");
		else
			System.out.println("Not Abundant Number");
	}
}

class Student {
	String name; 
	double per; 
	String cer;
	
	void input() 
	{
		Scanner obj= new Scanner (System.in);
		System.out.println(" Enter name , Percentage"); 
		name = obj.next();
		per = obj.nextDouble();	// ii), nextFloat() is okay too
		// per = obj.nextFloat();	// ii), nextFloat() is okay too
	}
	
	void merit() 
	{
		if( per>=90 )  // iii)
		{
			cer = "AWARDED";
		}
		else 
		{
			cer = "NOT AWARDED"; // iv)
		}
	}
	
	void display() 	// v)
	{
		System.out.println(name); 
		System.out.println(per); 
		System.out.println(cer);
	}
	
	void main() 
	{
		Student s = new Student();	// vi)
		s.input();
		s.merit();
		s.display();
	}
}

public class ICSE2022ComputerApplicationsBoardsSem1FullPaperSolved {
	
	
	
	public static void main(String[] args) {
		System.out.println(-7.3);
//		double x = Math.ceil(Math.abs(-7.3));
//		System.out.println("x: " + x);
		
		final double PI = 3.14;
		System.out.println("PI: " + PI);
		
		String s1 = "hello";
		int i1 = 20;
		System.out.println(s1.toUpperCase());
		
//		int x = 2;
//		int y = 4;
//		int z = 1;
//		int result = (++z)+y+(++x)+(z++);
//		System.out.println("result: " + result);
		// x=3, y=4, z=3
		// result = (++z)+y+(++x)+(z++);
		
		// result = (2) + 4 + (3) + (2) = 11
		
//		int x;
//		for( x=1; x<=3; x++ );
//		System.out.println("x:" + x);
		
		int f= 10,m=9;
		String e=(m%f==9) ? "YES" : "NO";
		System.out.println("e:" + e);
		
		System.out.println("-------");
		
		char x = 'g';
		switch(x){ 
		case 'M':
			System.out.print("Microsoft Teams");
			break; 
		
		case 'G':
			System.out.print("Google Meet"); 
		
		default:
			System.out.print("Any software");
			break; 
		
		case 'W':
			System.out.print("Web Ex"); 
			break;
		}
		System.out.println();
		
		System.out.println("-------");
		int v=5; 
		while(--v>=0) {
			System.out.print(v);
		}
		System.out.println();
		
		System.out.println("-------");
		Number number = new Number();
		number.Display(674);
		System.out.println("-------");
		number.Display();
		
		System.out.println();
		System.out.println("-------");
		Student student = new Student();
		student.main();
		
		System.out.println("-------");
		number.abundant(16);
	}

}
