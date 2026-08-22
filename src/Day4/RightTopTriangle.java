package Day4;

import java.util.Scanner;

public class RightTopTriangle  {
    static void main(){
            System.out.print("Lets print a top-Right aligned Triangle pattern\n Lines :> ");

            Scanner s = new Scanner(System.in);
            int line = s.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j <line ; j++) {
                if(j>=i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}
