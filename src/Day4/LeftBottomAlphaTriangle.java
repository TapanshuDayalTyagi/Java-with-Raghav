package Day4;

import java.util.Scanner;
public class LeftBottomAlphaTriangle {
    static void main(){
        System.out.print("Printing left-Bottom aligned triangle of Capital letters....\nLines : ");
        Scanner s;
        s = new Scanner(System.in);
        int side = s.nextInt();
        for (int i = 1; i <=side ; i++) {
            for (char x='A'; x<(char)'A'+i; x++)
                System.out.print(" "+ x+"  ");
            System.out.print("\n");
        }
    }
}
