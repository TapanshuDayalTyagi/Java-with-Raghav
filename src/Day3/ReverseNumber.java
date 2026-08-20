package Day3;

import java.util.Scanner;
public class ReverseNumber {
    static void main(){
        System.out.print("A number to get a reverse of it,\n Number :> ");
        Scanner s;
        s = new Scanner(System.in);
        long num = s.nextLong();
//        num = Long.MAX_VALUE;
        long reverse=0, x= num;
        while(x>0){
            reverse = reverse*10+(x%10);
            x/=10;
        }
        System.out.print(reverse+ " is the Reversed of the given number "+ num);
    }
}
