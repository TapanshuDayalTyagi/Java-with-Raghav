package Day4;

import java.util.Scanner;
public class AlphabetSmallcaseSquare {
    static void main(){
        System.out.print("Printing Square pattern with Small-Case Letters, provide dimension\nSide :> ");

        Scanner s;
        s = new Scanner(System.in);
        int side = s.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (char j = 'a'; j < (char)('a'+side) ; j++) {
                System.out.print(" "+ j+ "  ");
            System.out.print("\n");
            }
        }
    }
}
