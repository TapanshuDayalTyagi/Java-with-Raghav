package Day4;

import java.util.Scanner;
public class LeftTopTriangle {
    static void main(){
        System.out.print("Printing the '*'  Left-Top Triangle Pattern,\nLines => ");
        Scanner s = new Scanner(System.in);
        int line = s.nextInt();

        for (int i = 0; i <line ; i++) {
            for(int j = 0; j< line-i; j++)
                System.out.print(" *  ");
            System.out.print("\n");
        }
    }
}
