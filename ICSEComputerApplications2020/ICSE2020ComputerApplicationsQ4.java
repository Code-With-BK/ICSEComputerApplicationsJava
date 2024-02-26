
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2023. All rights reserved.
 * 
 * Java code solution for Question 4
 * of ICSE 2020 Computer Applications Boards Paper
 */
import java.util.Scanner;
class CabService {
    private String car_type;
    private double km;
    private double bill;

    public CabService() {
        car_type = "";
        km = 0;
        bill = 0;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        
        // read car type
        System.out.print("Enter car type: ");
        car_type = scanner.nextLine();

        // read km
        System.out.print("Enter km: ");
        km = scanner.nextDouble();
    }

    public void calculate() {
        if( car_type.equals("AC CAR") ) {
            if( km<=5 ) {
                bill = 150;
            }
            else {
                bill = 150 + (10*(km-5));
            }
        }
        else if( car_type.equals("NON AC CAR")) {
            if( km<=5 ) {
                bill = 120;
            }
            else {
                bill = 120 + (8*(km-5));
            }
        }
    }

    public void display() {
        System.out.println("CAR TYPE: " + car_type);
        System.out.println("KILOMETER TRAVELLED: " + km);
        System.out.println("TOTAL BILL: " + bill);
    }
}

public class ICSE2020ComputerApplicationsQ4 {
    public static void main(String args[]) {
        CabService cabService = new CabService();
        cabService.accept();
        cabService.calculate();
        cabService.display();
    }
}
