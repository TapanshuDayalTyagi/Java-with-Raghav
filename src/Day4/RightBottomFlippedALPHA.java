package Day4;

import java.util.Scanner;
public class RightBottomFlippedALPHA {
    static void main(){
        System.out.print(" Printing a Botton-Right Aligned letters' Triangle\n  Lines :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();
        char x= (char)'A';
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (i+j+1>=line)System.out.print(x);
                else System.out.print("  ");
            }
            x++;
            System.out.print("\n");
        }
    }
}
