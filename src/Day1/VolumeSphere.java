package Day1;
import java.util.Scanner;
public class VolumeSphere {
    static void main() {
        System.out.print("Volume of Sphere has to be calculated \n\n radius : ");
        java.util.Scanner nm = new Scanner(System.in);
        double rad = nm.nextDouble();
//        volume of a Sphere = 4 x 22 x rad^3 / 7
        double  vol =  (4.0/3)*22*(Math.pow(rad,3))/7.0;
        System.out.print("Volume of Sphere with radius of " + rad+ " units, is "+ vol+ " units cube..");
        nm.close();
    }
}
