package Day5;

import java.util.Scanner;

public class Swap2Numbers {
    static void main() {
        System.out.print("Input 2 numbers and get the value swapped in between,\n Num1 = ");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        System.out.print("Num2 = ");
        int b = x.nextInt();

//        Third variable
/*        int z;
        z=a;
        a=b;
        b=z;
   */

   //Mathematical Way
  /* a=a+b;
   b=a-b;
   a=a-b;
        System.out.println("Here values have been swapped,\n Num1 ="+a+"\nNum2 = "+b);*/
        swap(a,b);
    }
//    External/ Explicit function declaration
    static void swap(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Here values have been swapped,\n Num1 ="+x+"\nNum2 = "+y);
    }
}
