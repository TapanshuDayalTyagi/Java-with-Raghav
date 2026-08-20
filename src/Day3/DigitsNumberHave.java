package Day3;

import java.util.Scanner;
public class DigitsNumberHave {
    static void main(){
        System.out.print("share a number to get the total number of digits it have...\nNumber :> ");
        Scanner c;
        c = new Scanner(System.in);
        long x = c.nextLong();
        long q=0,d=x;
       if (d==0)
           q=1;
       else{
           while(d!=0) {
               d /= 10;
               q++;
           }
       }
        System.out.print(x+" is a "+q+ " digit number");

    }
}
