package Day1;
import java.util.Scanner;
public class Para_Area_Circle {
    static void main() {
        double para, area;
        System.out.print("Here, we are to find the parameter and the area of a Circle \n\n Input radius : ");
        Scanner inp = new Scanner(System.in);
        double rad = inp.nextDouble();


//        parameter / Circumference = 2 x (Pi) x radius  ___ Pi = 22/7
        para = 2 * 22 * rad / 7;
//          area = Pi x radius * radius   i.e. radius ^2
        area = 22 * rad * rad / 7;

        System.out.print("Circle with Radius of "+rad+" units, have \nCircumference : "+para+" units\nArea :" +area+" unit sqr.");
        inp.close();
    }
}
