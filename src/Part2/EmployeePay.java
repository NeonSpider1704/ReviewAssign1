package Part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours = 0, ot_hours, employees;
        double wage = 15, ot_wage = 22.50;
        double total_pay = 0, ot_pay = 0, reg_pay = 0;

        for (employees = 1; employees < 6; employees++) {
            while(true){
                System.out.print("Enter hours worked for employee " + employees + ": ");
                hours = s.nextInt();
                 if(hours >= 1 && hours<= 70)break;
                 
                 System.out.println("INVALID - try again");
            }

            if (hours > 40) {
                ot_hours = hours - 40;
                reg_pay = hours * wage;
                ot_pay = ot_hours * ot_wage;
                total_pay = ot_pay + reg_pay;
            } else {
                ot_hours = 0;
                reg_pay = hours * wage;
                ot_pay = ot_hours * ot_wage;
                total_pay = ot_pay + reg_pay;
            } 

            System.out.println("Regular pay: $" + reg_pay);
            System.out.println("Overtime pay: $" + ot_pay);
            System.out.println("Total pay: $" + total_pay);
        }

    }
}
