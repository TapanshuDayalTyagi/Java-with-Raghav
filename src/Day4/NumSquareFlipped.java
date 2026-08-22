package Day4;

import java.util.Scanner;
public class NumSquareFlipped {
    static void main(){
        System.out.print("Printing Number Square pattern, Provide the dimension,\n Side :> ");
        Scanner s;
        s = new Scanner(System.in);
        int side = s.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (int j = 1; j <=side ; j++)
                System.out.print(" "+ i+ "  ");

            System.out.print("\n");
        }
    }
}
