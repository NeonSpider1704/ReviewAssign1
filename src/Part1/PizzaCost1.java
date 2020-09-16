package Part1;


import java.util.Scanner;


public class PizzaCost1 {

    
    public static void main(String[] args) {
         int toppings;
         double inches, pizzacost, gascost, total;
         
         
         Scanner s = new Scanner(System.in);
         
         //Input
         System.out.print("Enter the size of the pizza (in Inches) >> ");
         inches = s.nextInt();
         
         System.out.print("Enter the number of toppings >> ");
         toppings = s.nextInt();
         
         //Output
         pizzacost = 1.50;
         gascost = 0.75;
         
         total = pizzacost + gascost + (toppings * 0.75)+(inches * 0.50);
         System.out.print(String.format("The total cost is: %.2f\n", total));
         
         
    }
    
}
