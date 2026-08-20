package Day3;

import java.util.Scanner;
public class A_toPowerOf_B {
    static void main(){
        System.out.print("finding the value of Powered numbers\n Provide the base, Number :>  ");
        Scanner s;
        s = new Scanner(System.in);
        int base = s.nextInt();
        System.out.print("Power :> ");
        int power = s.nextInt();

//      SIMPLE LOOP
       int z=1;
/*         for (int i = 1; i <=power ; i++) {
            z*=base;
        } */
//        MATH LIBRARY FUNCTION  Math.pow(base,power);
        z = Math.powExact( base, power);     //Exact for Integer
        System.out.print("value of "+base+ " power "+ power+ " is "+z);
    }
}
