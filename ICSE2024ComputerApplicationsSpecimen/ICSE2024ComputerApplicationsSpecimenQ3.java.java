
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 3 of 
 * ICSE 2024 Computer Applications Specimen Paper
 */

import java.util.Scanner;

class Eshop {
    private String name;
    private double price;
    // private double netPrice;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name = scanner.nextLine();
        System.out.print("Enter price: ");
        price = scanner.nextDouble();
    }

    public void calculate() {
        double discount = 0;

        if( price>=1000 && price<=25000 ) {
            discount = 5;
        }
        else if( price>=25001 && price<=57000 ) {
            discount = 7.5;
        }
        else if( price>=57001 && price<=100000 ) {
            discount = 10.0;
        }
        else if( price>=100000 ) {
            discount = 15.0;
        }

        double discountAmount = (discount*0.01)*price;
        double netAmount = price - discountAmount;
        // netPrice = price - discountAmount;
        System.out.println("Net amount to be paid: " + netAmount);
    }

    public void display() {
        System.out.println("Name: " + name);
        // System.out.println("Net amount to be paid: " + netPrice);
        calculate(); 
    }

}

public class ICSE2024ComputerApplicationsSpecimenQ3 {
    public static void main(String args[]) {
        Eshop eshop = new Eshop();
        eshop.accept();
        // eshop.calculate();
        eshop.display();
    }
}
