package Day1;

import java.util.Scanner;

public class AreaCuboid {
    static void main() {
        java.util.Scanner nm = new Scanner(System.in);
        double tsa, length, width, height;
        System.out.print("Finding the total surface area of a Cuboid provide \nLength : ");
        length = nm.nextDouble();
        System.out.print("Width : ");
        width = nm.nextDouble();
        System.out.print("Height : ");
        height = nm.nextDouble();

//        Total surface area of a Cuboid = 2 x ( lxb + bxh + lxh )
        tsa = 2*( (length * width) + (width * height) + ( height * length ) );
        System.out.print("\n Total surface Area of the Cuboid is "+ tsa + " unit sq.");
        nm.close();
    }
}
