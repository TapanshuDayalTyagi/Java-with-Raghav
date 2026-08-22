package Day4;

import java.util.Scanner;
public class RightBottomNum {
    static void main(){
        System.out.print("Lets print Number series in a Bottom-Right aligned Triangle pattern\nLines :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();

        for (int i = 0; i < line; i++) {
            int x=1;
            for (int j =0; j <line; j++) {
                if (line<=i+j+1) System.out.print((x++)+"   ");
                else System.out.print("     ");
            }
            System.out.print("\n");
        }
    }
}
