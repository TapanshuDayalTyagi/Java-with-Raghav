package Day5;

import java.util.Scanner;

public class FunctionWithArguments {
    static void main(){
        System.out.println("Printing sum of two number\n Input :> ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        add(a,b);
    }

    static void add(int a, int b){
        System.out.print("Sum of "+a+" and "+b+" is "+ (a+b));
    }
}
