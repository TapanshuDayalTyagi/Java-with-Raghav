package Day4;

import java.util.Scanner;

public class Square {
    static void main(){
        System.out.print("Printing the Square pattern\nProvide the Dimension,  Side -: ");

        Scanner s;
        s = new Scanner(System.in);
        int side = s.nextInt();

        for (int i=0; i<side; i++){
            for (int j = 0; j < side; j++) {
                System.out.print("  * ");
            }
            System.out.print("\n");
        }
    }
}
