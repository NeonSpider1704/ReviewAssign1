
package Part2;

import java.text.NumberFormat;
import java.util.Scanner;


public class PowersChart {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num,x,ans;
        System.out.print("Enter your number:  ");
        num = s.nextInt();
        //System.out.println(Math.pow(x, 3)); 
        
        
        //print column headings
        System.out.format("%5s","X");
        System.out.format("%20s\n","X^2");
        
        
        System.out.format("%5s","--");
        System.out.format("%20s","-----");
        
        
        for (int x = 0; x <= 10; x+=1) {
            
            System.out.format("%5d", x);
            System.out.format("%20s", ans);
            
            
        }
    } 
}
