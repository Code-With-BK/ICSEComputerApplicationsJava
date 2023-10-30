
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 3 of ICSE 2023 Computer Applications Paper
 */
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int mks;
    private String stream;
    
    public void accept() {
        Scanner scanner = new Scanner(System.in);

        // read name
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        // read age
        System.out.print("Enter age: ");
        age = scanner.nextInt();

        // read marks
        System.out.print("Enter marks: ");
        mks = scanner.nextInt();
    }

    public void allocation() {
        if( mks>=300 ) {
            stream = "Science and Computer";
        }
        else if( mks>=200 ){
            stream = "Commerce and Computer";
        }
        else if( mks >= 75 ) {
            stream = "Arts and Animation";
        }
        else {
            stream = "Try Again";
        }
    }

    public void print() {
        System.out.println("Student details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Marks: " + mks);
        System.out.println("Stream: " + stream);
    }
}

public class ICSE2023ComputerApplicationsQuestion3 {
    public static void main(String args[]) {
        Student student = new Student();
        student.accept();
        student.allocation();
        student.print();
    }
}
