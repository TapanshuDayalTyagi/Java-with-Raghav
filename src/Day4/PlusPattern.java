package Day4;

import java.util.Scanner;
public class PlusPattern {
    static void main(){
        System.out.print("Input the Odd Integer value to get a perfect Pattern\nNote : line>=3\n Line :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();
        if (line%2==0){
            line++;
        }
            System.out.println("For sake of a perfect pattern, lines incremented by 1 ");
            for (int i = 1; i <= line; i++) {
                for (int j = 1; j <= line; j++) {
                    if (i == (line / 2) + 1 || j == (line / 2) + 1)
                        System.out.print("*   ");
                    else
                        System.out.print("    ");
                }
                System.out.print("\n");
            }

    }
}
