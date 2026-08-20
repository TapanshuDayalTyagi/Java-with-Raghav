package Day3;

import java.util.Scanner;

public class GP_1_2_4_8 {
    static void main(){
        System.out.print("Printing Geometric Progression_, 1, 2, 4, 8, 16,....\n Share the number of term to be printed,\n Terms :> ");
        Scanner s;
        s = new Scanner(System.in);
        int terms = s.nextInt();
        System.out.println();
        for (int i = 0; i <terms ; i++) {
            System.out.print(Math.powExact(2,i)+ "  ");
        }
    }
}
