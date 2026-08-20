package Day3;

import java.util.Scanner;

public class OddMultipleOf3 {
    static void main(){
        System.out.print("Provide an integer to get all ODD Multiple of 3\n number :> ");
        Scanner m;
        m = new Scanner(System.in);
        int num = m.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (i%2!=0 && i%3==0)
                System.out.print("\n"+ i);
        }
    }
}
