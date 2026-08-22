package Day5;

import java.util.Scanner;

import static Day5.MaxOf3Arguments.Max;

public class mAX3Return {
    static void main(){
        System.out.print("Input the 3 values to the Maximum of all\n");
        Scanner x = new Scanner(System.in);
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        System.out.print(Max(a,b,c) +" is the Maximum of three...");
        x.close();
    }
    static double Max(double x, double y, double z){
        return (Math.max(x,Math.max(y,z)));
    }
}
