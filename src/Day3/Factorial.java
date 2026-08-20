package Day3;

import java.util.Scanner;
public class Factorial {
    static void main(){
        System.out.print("factorial of the integer, Number :> ");
        Scanner s;
        s = new Scanner(System.in);

        int num = s.nextInt();
        long x= num;
        for(long i =x-1; i > 1; i--){
            x*=i;
        }
        System.out.print("factorial of "+num+ " is "+x);
    }
}
