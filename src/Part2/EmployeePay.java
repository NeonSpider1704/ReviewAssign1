
package Part2;

import java.util.Scanner;


public class EmployeePay {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours, ot_hours;
        double wage = 15, ot_wage = 22.50, total_pay;
        
        System.out.print("Enter hours worked: ");
        hours = s.nextInt();
        
        if (hours>40 && hours<=70) {
            ot_hours= hours - 40;
            total_pay = (wage * 40) +(ot_wage * ot_hours);
        }
        else if(hours<40){
            total_pay = (wage * hours);
        }
        else{
            System.out.println("ERROR - MUST BE UNDER 70 hours");
        }
    }
    
}
