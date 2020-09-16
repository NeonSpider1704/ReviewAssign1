import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class BarChart {
    static SketchPadWindow win = new SketchPadWindow(800,600);
    static Pen p = new StandardPen(win);
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4;
        
        System.out.print("Enter value 1 of 4 >> ");
        num1= scan.nextInt();
        System.out.print("Enter value 2 of 4 >> ");
        num2= scan.nextInt();
        System.out.print("Enter value 3 of 4 >> ");
        num3= scan.nextInt();
        System.out.print("Enter value 4 of 4 >> ");
        num4= scan.nextInt();
        
        makeBar(-150,-135,num1,Color.red);
        makeBar(-75,-135,num2,Color.blue);
        makeBar(0,-135,num3,Color.green);
        makeBar(75,-135,num4,Color.yellow);
        line(-150,-135);
        
    }
    
    public static void makeBar(int xloc, int yloc, int length, Color col){
        p.setWidth(15);
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(15);
        p.down();
        p.drawString(length + "");
       
    }
    
    public static void line(int xloc, int yloc){
       
       p.setColor(Color.black);
       p.setWidth(3);
       p.setDirection(180);
       p.move(225);
       
   }
    
}
