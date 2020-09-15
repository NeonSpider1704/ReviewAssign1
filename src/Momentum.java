
import java.util.Scanner;


public class Momentum {

  
    public static void main(String[] args) {
       double momentum;
       double mass, velocity;
       
       Scanner s = new Scanner(System.in);
       
       //asks for mass and velocity
        System.out.print("Enter objects mass (in kg)>> ");
        mass = s.nextDouble();
        System.out.print("Enter objects velocity (in m/s)>> ");
        velocity = s.nextDouble();
        
        //calculate momentum
        momentum = mass * velocity;
        
        //print the answer
        System.out.println(String.format("The objects momentum is %.2f", momentum));
    }
    
}
