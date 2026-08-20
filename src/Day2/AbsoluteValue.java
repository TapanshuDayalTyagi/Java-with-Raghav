package Day2;

import java.util.Scanner;

public class AbsoluteValue {
//    Distance of number from 0 over number line
static void main() {
    System.out.print("Enter an integer value to get it's Absolute Value, \n number : ");
    Scanner m;
    m= new Scanner(System.in);
    int n= m.nextInt();
/*    if (n>=0)
        System.out.print("\nAbsolute Value is "+n);
    else
        System.out.print("\nAbsolute value is "+ -n);
    */

//    wanna use only IF
    if (n<0) n=-n;
    System.out.print("\n Absolute Value is "+n);

    m.close();
}
}
