package Day4;

import java.util.Scanner;
public class AlphabetCapitalSquare {
    static void main(){
        System.out.print("Printing Capital Letter in Square Pattern,\n provide the Dimension, Side :> ");
        Scanner s;
        s = new Scanner(System.in);
        int side = s.nextInt();
        for (int i =1; i<=side ; i++){
            char z = (char) ('A'+side);
            for (char j ='A'; j<z; j++ )
                System.out.print(" "+j+"  ");
            System.out.print("\n");
        }
    }
}
