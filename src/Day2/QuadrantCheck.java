package Day2;

import java.util.Scanner;

// presence of a point at which quadrant , axis or origin a(x,y)
public class QuadrantCheck {
    static void main(String[] args){
        System.out.print("Input values of x and y coordinates, for a point\n x= ");
        double x,y;
        Scanner m;
        m = new Scanner(System.in);
        x= m.nextDouble();
        System.out.print("y = ");
        y= m.nextDouble();

//        NESTED CONDITIONALS
 /*       if (x==0){
            if (y==0)
                System.out.print("__ORIGIN__");
            else
                System.out.print("_ Y axis _");
        }
        else if (x>0){
            if (y>0)
                System.out.print("1st Quadrant");
            else if (y==0)
                System.out.print("_ X axis _");
            else
                System.out.print("2nd quadrant");
        }
        else {
            if (y<0)
                System.out.print("3rd Quadrant");
            else if(y==0)
                System.out.print("_ X axis _");
            else
                System.out.print("4th quadrant");
        }
*/


//        INDEPENDENT METHOD
        if(x==0 && y==0)
            System.out.print("ORIGIN");
        else if (x == 0)
            System.out.print("Y axis");
        else if (y==0)
            System.out.print("X axis");
        else if (x>0 && y>0)
            System.out.print("1st Quadrant");
        else if (x>0 && y<0)
            System.out.print("2nd quadrant");
        else if(x<0 && y<0)
            System.out.print("3rd Quadrant");
        else
            System.out.print("4th Quadrant");

        m.close();
    }
}
