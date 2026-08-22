package Day4;

import java.util.Scanner;
public class RightBottomTriangle {
    static void main(){
        System.out.print("Printing a Bottom-right aligned Triangle Pattern\n Lines :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line; j++) {
                if (i+j>line)
                    System.out.print("  *  ");
                else
                    System.out.print("     ");
            }
            System.out.print("\n");
        }
    }
}
