package Day2;

import java.util.Scanner;

public class IsReal_a_Integer {
    static void main() {
        System.out.print("Is a Real number (i.e. DOUBLE ) an Integer??? \n Number : ");
        Scanner m;
        m = new Scanner(System.in);
        double n= m.nextDouble();
//        int x= (int)n;
        if (n==(int)n)
            System.out.print(n +" is NOT an Integer..");
        else
            System.out.print( n +" is an Integer..");
    }
}
