
package Part2;

import java.text.NumberFormat;


public class SalaryTable {

    
    public static void main(String[] args) {
        int oldsal = 40000;
        int raise;
        NumberFormat nf = NumberFormat.getNumberInstance();
        //can also use Currency and number symbols
        
        //print column headings
        System.out.format("%5s","YEAR");
        System.out.format("%20s","OLD SALARY");
        System.out.format("%15s","RAISE");
        System.out.format("%20s\n","NEW SALARY");
        
        System.out.format("%5s","====");
        System.out.format("%20s","==========");
        System.out.format("%15s","======");
        System.out.format("%20s\n","==========");
        
        for (int year = 1; year <= 10; year+=1) {
            System.out.format("%5d", year);
            System.out.format("%20s", nf.format(oldsal));
            raise = (int)(0.03 * oldsal); //have to cast integer
            System.out.format("%15s", nf.format(raise));
            oldsal += raise;
            System.out.format("%20s\n", nf.format(oldsal));
        }
    }
}
