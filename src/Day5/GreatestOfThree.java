package Day5;

import java.util.Scanner;
public class GreatestOfThree {
    static void main(){
        System.out.println("Printing Greatest of 3 using math function\n Values");
        Scanner s = new Scanner(System.in);
        double a =s.nextDouble();
        double b =s.nextDouble();
        double c =s.nextDouble();

        System.out.print(Math.max(Math.max(a,b),c)+" is the maximum of three...!");
    }
}
