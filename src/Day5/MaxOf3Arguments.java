package Day5;

import java.util.Scanner;

public class MaxOf3Arguments {
    static void main(){
        System.out.print("Share 3 numbers to get Maximum of all\n Numbers");
        Scanner x= new Scanner(System.in);
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        Max(a,b,c);
    }

     static void Max(double a, double b, double c) {
        if (a>b){
            if (a>=c) System.out.print(a+" is the greatest");
            else System.out.print(c+" is the greatest");
        }
        else{
            if (b>=c) System.out.print(b+" is the greatest");
            else System.out.print(c+ " is the greatest");
        }
    }
}
