package Day3;

import java.util.Scanner;
public class AP2_5_8__ {
    static void main(){
        System.out.print("Arithmetic Progression,  2, 5, 8, 11, ...., provide the values upto the nth term of this progression.. . . .\n Term  n :> ");
        Scanner s;
        s= new Scanner(System.in);
        int n= s.nextInt();
        int x=2,d=3;
        for (int i = 0; i <n ; i++) {
        System.out.print(x+"  ");
            x+=d;
        }
    }
}
