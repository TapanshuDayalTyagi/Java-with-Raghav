package Day4;

import java.util.Scanner;
public class NumberSquare {
    static void main(){
        System.out.print("here we are printing a Square pattern of numbers in sequence \nProvide the dimension,   Side :> ");
        Scanner s;
        s = new Scanner(System.in);
        int side = s.nextInt();

        for (int i=1; i <=side; i++){
            for (int j=1; j<=side ; j++){
                System.out.print(" "+j+"  ");
            }
            System.out.print("\n");
        }
    }
}
