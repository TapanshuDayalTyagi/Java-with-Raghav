package Day4;

import java.util.Scanner;
public class LeftBottomNUMTriangle {
    static void main(){
        System.out.print("Printing a Left-Bottom aligned Number Triangle, Provide the dimension,\nSide :> ");
        Scanner s;
        s = new Scanner(System.in);
        int side = s.nextInt();
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <=i ; j++)
                System.out.print(" "+ j+ "  ");
            System.out.print("\n");
        }
    }
}
