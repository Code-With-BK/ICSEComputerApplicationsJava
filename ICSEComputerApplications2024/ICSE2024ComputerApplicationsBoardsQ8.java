import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 8 
 * ICSE 2024 Computer Applications Paper
 */

class Question8 {
	private String email;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an email id: ");
		email = scanner.nextLine();
	}
	
	public void validateEmail() {
		boolean validEmail = true;
		
		validEmail = validEmail && email.contains("@");
		validEmail = validEmail && email.contains(".");
		validEmail = validEmail && email.contains("gmail");
		validEmail = validEmail && email.contains("com");
		
		if( validEmail ) {
			System.out.println(email + " is a valid gmail id");
		}
		else {
			System.out.println(email + " is an invalid gmail id");
		}
		
//		if( email.endsWith("@gmail.com") ) {
//			System.out.println(email + " is a valid gmail id");
//		}
//		else {
//			System.out.println(email + " is an invalid gmail id");
//		}
	}
}

public class ICSE2024ComputerApplicationsBoardsQ8 {
	public static void main(String[] args) {
		Question8 question8 = new Question8();
		question8.accept();
		question8.validateEmail();
	}
}
