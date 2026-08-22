package Day5;

import java.util.Scanner;
public class GreatestOfFour {
    static void main(){
        System.out.println("Input the 4 numbers to the greatest of ALL");
        Scanner s = new Scanner(System.in);
        double w = s.nextDouble();
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();
        System.out.print(Math.max(Math.max(w,x),Math.max(y,z))+" is the maximum of all Fours");
    }
}
