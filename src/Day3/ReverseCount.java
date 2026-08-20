package Day3;

import java.util.Scanner;
public class ReverseCount {
    static void main(){
        System.out.print("Input an integer to get Reverse count upto 0\nNumber :> ");
        Scanner m;
        m = new Scanner(System.in);
        int num = m.nextInt();
        for (int i=num;i>=0;i--){
            System.out.print("  "+i);
        }
    }
}
