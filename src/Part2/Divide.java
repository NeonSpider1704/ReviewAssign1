
package Part2;

import java.util.Scanner;

public class Divide {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, num_quotient, num_remainder;
        System.out.print("Enter First Number: ");
        num1 = s.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = s.nextInt();
        
        if (num1>num2) {
            num_quotient = num1/num2;
            num_remainder = num1 % num2;
            System.out.format("The answer is: %d r %d\n",num_quotient, num_remainder);
        }
        else{
            num_quotient = num2/num1;
            num_remainder = num2 % num1;
            System.out.format("The answer is: %d r %d\n",num_quotient, num_remainder);
        }
    }
    
}
