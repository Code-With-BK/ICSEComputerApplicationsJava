/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 8
 * ICSE 2023 Computer Applications Specimen Paper
 */

import java.util.Scanner;

class Question8 {
    
    private String[] names;
    // private Scanner scanner;

    public Question8() {
        names = new String[10];
        // scanner = new Scanner(System.in);
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 names: ");
        for( int i=0; i<10; i++ ){
            String name = scanner.nextLine();
            names[i] = name;
        }
    }

    public void linearSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String name = scanner.nextLine();

        int index = -1;
        for( int i=0; i<10; i++ ) {
            if( names[i].equals(name) ) {
                index = i;
            }
        }

        if( index==-1 ) {
            System.out.println("Name \"" + name + "\" not found!");
        }
        else {
            System.out.println("Name \"" + name + "\" found at index " + index + "!");
        }
    }

    public void printNamesWithSRI() {
        System.out.println("Names starting with 'SRI':");
        for( int i=0; i<10; i++ ) {
            String name = names[i];
            // name begins with 'SRI' 
            // if the first letter is 'S'
            // second letter is 'R'
            // third letter is 'I'
            if( name.length()>=3 ) {
                if( name.charAt(0)=='S' && name.charAt(1)=='R' && name.charAt(2)=='I' ) {
                    System.out.println(name);
                }
            }
        }
    }
}

public class ICSESpecimen2023ComputerApplicationsQuestion8 {
    public static void main(String args[]) {
        Question8 question8 = new Question8();
        question8.accept();
        question8.linearSearch();
        question8.printNamesWithSRI();
    }
}
