package Day4;

import java.util.Scanner;
public class Rhombus {
    static void main(){
        System.out.print("Here we are printing a Rhombus shaped Pattern \n Provide the dimension i.e. Side :> ");
        Scanner s = new Scanner(System.in);
        int side = s.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j <side-i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < side; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
