package Day4;

import java.util.Scanner;
public class LeftBottomTriangle {
    static void main(){
        System.out.print("Printing a Left-Bottom aligned, provide the dimension\n side :> ");

        Scanner s;
         s = new Scanner(System.in);
         int side = s.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  * ");
            }
            System.out.print("\n");
        }
    }
}
