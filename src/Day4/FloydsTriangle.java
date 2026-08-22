package Day4;

import java.util.Scanner;
public class FloydsTriangle {
    static void main(){
            System.out.print("Lets print counting in Left-Bottom aligned Triangle pattern,\nLines :> ");
            Scanner s = new Scanner(System.in);
            int line = s.nextInt();
            int x=1;
        for (int i = 1; i <= line; i++) {
            for (int j = 0; j <i; j++)
                System.out.print(" "+ x++ +" ");

            System.out.print("\n");
        }
    }
}
