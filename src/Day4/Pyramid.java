package Day4;

import java.util.Scanner;
public class Pyramid {
    static void main(){
        System.out.print("Here bwe are printing a Pyramid shaped pattern\n Lines :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line-i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*line-1 ; j++) {
                if (j<=2*i -1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}
