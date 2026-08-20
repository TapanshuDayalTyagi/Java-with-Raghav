package Day2;

import java.util.Scanner;

//Input 3 values and check whether these can form a triangle
public class isTriangle {
    static void main(){
        double a,b,c, para;
        System.out.print("Input all three values for TRIANGLE checking....\n");
        Scanner m;
        m = new Scanner(System.in);
        a= m.nextDouble();
        b= m.nextDouble();
        c= m.nextDouble();
        para=a+b+c;
        para=0.5*para;
        if (a>=para || b>=para || c>=para)
            System.out.print("With the given Values for sides, a= "+a+", b= "+b+", c= "+c+ " triangle can't be formed");
        else
            System.out.print("Yeah, with the given values for sides a="+a+", b= "+b+", c= "+c+", A TRIANGLE can be formed");
        m.close();
    }
}
