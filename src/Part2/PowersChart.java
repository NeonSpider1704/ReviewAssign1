
package Part2;

import java.text.NumberFormat;
import java.util.Scanner;


public class PowersChart {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num,ans;
        System.out.print("Enter your number:  ");
        num = s.nextInt();
         
        
        
        //print column headings
        System.out.format("%5s","X");
        System.out.format("%20s\n","X^2");
        
        
        System.out.format("%5s","--");
        System.out.format("%20s\n","-----");
        
        
        for (int x = 0; x <= num; x++){
           System.out.format("%5s",x);
           System.out.format("%20.0f\n",Math.pow(2,x));
        }
    } 
}
