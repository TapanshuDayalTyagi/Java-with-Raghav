package Day3;

import java.util.Scanner;

public class SumOfDigits {
    static void main(){
        System.out.print("Input an Integer value : ");
        Scanner s;
        s = new Scanner(System.in);
        long x = s.nextLong();
        long c = x,add=0;
        while(c>0){
            add+=(c%10);
            c/=10;
        }
        System.out.print(add+" is the of digits of given number, "+x);
    }
}
