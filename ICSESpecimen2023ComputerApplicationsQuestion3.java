/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 3 of ICSE 2023 Computer Applications Specimen Paper
 */

import java.util.Scanner;

class employee {

    private String eno;
    private String ename;
    private int age;
    private double basic;
    private double net;

    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        eno = scanner.nextLine();

        System.out.print("Enter employee name: ");
        ename = scanner.nextLine();

        System.out.print("Enter employee age: ");
        age = scanner.nextInt();

        System.out.print("Enter basic salary: ");
        basic = scanner.nextDouble();
    }

    public void calculate() {
        double hra = (18.5/100) * basic;
        double da = (17.45/100) * basic;
        double pf = (8.10/100) * basic;

        // double net = basic + hra + da - pf;
        net = basic + hra + da - pf;
        if( age>50 ) {
            net += 5000;
        }
    }

    public void print() {
        System.out.printf("%20s %10s %5s %10s %10s\n", "eno", "ename", "age", "basic", "net");
        System.out.printf("%20s %10s %5d %10.2f %10.2f\n", eno, ename, age, basic, net);

        // System.out.println("eno\tename\tage\tbasic\tnet");
        // System.out.println(eno + "\t" + ename + "\t" +  age + "\t" +  basic + "\t" +  net);
    }
}
    
public class ICSESpecimen2023ComputerApplicationsQuestion3 {
    public static void main(String args[]) {
        employee employee1 = new employee();
        employee1.accept();
        employee1.calculate();
        employee1.print();
    }
}
