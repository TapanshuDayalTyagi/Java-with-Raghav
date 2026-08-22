package Day4;

import java.util.Scanner;
public class Bridge {
    static void main(){
        System.out.print("Printing the BRIDE Pattern,\n Lines :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();
//        first line
        for (int i = 1; i <2*line ; i++) {
            System.out.print("0");
        }
//        rest pattern
        for (int j = 0; j < line; j++) {
            System.out.print("\n");
            for (int i = 0; i < 2; i++) {
                for (int k = 1; k < line-j; k++) {
                    System.out.print("0");
                }
                for (int k = 0; k <=2*j+1; k++) {
                    System.out.print(" ");
                }
            }
        }
    } 
}
