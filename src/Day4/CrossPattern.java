package Day4;

import java.util.Scanner;

public class CrossPattern {
    static void main(){
        System.out.print("Printing Cross pattern, Provide an ODD input,\nLines :> ");
        Scanner s = new Scanner(System.in);
        int line =s.nextInt();
        if (line%2==0)
            System.out.println("For the sake of a perfect pattern value of line is increased by one i.e."+ ++line);

        for (int i = 0; i <line ; i++) {
            for (int j = 0; j <line ; j++) {
                if (i+j==line-1 || i==j)
                    System.out.print("   *  ");
                else
                    System.out.print("      ");
            }
            System.out.print("\n");
        }
    }
}
