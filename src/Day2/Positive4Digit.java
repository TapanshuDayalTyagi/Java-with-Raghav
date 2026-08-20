package Day2;

import java.util.Scanner;

public class Positive4Digit {
    static boolean four(int x){
        boolean a;
        int z=0;
        while(x>0){
            x=x/10;
            z++;
        }
        if (z==4)
            a = true;
        else
            a = false;
        return  a;
    }
    static void main() {
        System.out.print("Enter an Integer value : ");
        Scanner m;
        m = new Scanner(System.in);
        int n = m.nextInt();
        if (n>0 || four(n) )
            System.out.print(n+ " is a 4-digit positive Integer");
        else
            System.out.print(n+ " is NOT a 4-digit Integer");



        // SIMPLE ONE
//        if (999 < n && n < 10000)
//            System.out.print(n + " is a 4-digit positive Integer");
//        else
//            System.out.print(n + " is NOT a 4-digit positive Integer");
    }
}

