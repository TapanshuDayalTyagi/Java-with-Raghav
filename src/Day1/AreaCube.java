package Day1;

import java.util.Scanner;

public class AreaCube {
    static void main() {
        System.out.print("Let's Calculate the Total Surface Area of a Cube,\n with the side : ");
        java.util.Scanner nm = new Scanner(System.in);
        double side = nm.nextDouble();

//        TSA of cube  = 6 x side x side
        double tsa = 6 * side * side;
        System.out.print("Total Surface Area of Cube with side "+ side +" units, is "+tsa+ " unit sq.");
        nm.close();

    }
}
