package Day4;

import java.util.Scanner;

public class BinaryFloyd {
    static void main(){
        System.out.print("Printing the Binary Alternative sequence in Floyd's Triangle format,\n Lines :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j <=i ; j++) {
                if( (i+j)%2==0 )
                    System.out.print(" 1 ");
                else
                    System.out.print(" 0 ");
            }
            System.out.print("\n");
        }
    }
}
