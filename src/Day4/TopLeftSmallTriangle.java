package Day4;

import java.util.Scanner;
public class TopLeftSmallTriangle {
    static void main(){
        System.out.print("Small Case letters' Top Left Aligned Triangle,\n Lines :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();

        for (int i = 0; i < line; i++) {
            for (char x='a'; x<(char) 'a'+line-i;x++)
                System.out.print(" "+x+"  ");
            System.out.print("\n");
        }
    }
}
