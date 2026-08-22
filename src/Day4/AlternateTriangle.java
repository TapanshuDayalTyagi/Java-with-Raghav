package Day4;

import java.util.Scanner;
public class AlternateTriangle {
    static void main(){
        System.out.print("Printing Alternate Alpha-Numeric left-Bottom aligned Triangle\n Lines :> ");
        Scanner s = new Scanner(System.in);
        int lines = s.nextInt();
        for (int i = 1; i <=lines ; i++) {
            if (i%2!=0){
                for (int j = 1; j <=i ; j++)
                    System.out.print(" "+j+"  ");
            }
            else {
                for (char j = 'A'; j < (char)'A'+i ; j++)
                    System.out.print(" "+j+"  ");
            }
            System.out.print("\n");
        }
    }
}
