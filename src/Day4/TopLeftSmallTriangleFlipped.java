package Day4;

import java.util.Scanner;
public class TopLeftSmallTriangleFlipped {
    static void main(){
        System.out.print("Printing a to left-top aligned  small case letters' Triangle\n Line :> ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();
        char z='a';
        for (int i=0; i<line; i++){
            for(int j =0; j<line-i; j++)
                System.out.print(" "+z+"  ");
            System.out.print("\n");
            z++;
        }
    }
}
