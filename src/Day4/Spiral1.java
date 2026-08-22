package Day4;

import java.util.Scanner;
public class Spiral1 {
    static void main(){
        System.out.print("Printing Square Spiral Pattern\n Lines :> ");
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        for (int i = 1; i < 2*x; i++) {
            for (int j = 1; j < 2*x; j++) {
              if (i>x){
                  if (j>x)System.out.print("  "+Math.min(2*x-i,2*x-j)+" ");
                  else System.out.print("  "+Math.min(2*x-i,j)+" ");
              }
              else{
                  if (j>x)System.out.print("  "+Math.min(i,2*x-j)+" ");
                  else System.out.print("  "+Math.min(i,j)+" ");
              }

            }
            System.out.print("\n");
        }
    }
}
