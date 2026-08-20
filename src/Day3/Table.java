package Day3;

import java.util.Scanner;

public class Table {
    static void main(){
        System.out.print("Input a number to get its MULTIPLICATION TABLE as OUTPUT\nNumber :> ");
        Scanner m;
        m= new Scanner(System.in);
        int num = m.nextInt();
        System.out.print("\nTABLE OF "+ num);
        int i=1;
        while(i<=10){
            System.out.print("\n"+ num+" x "+i+" = "+ num*i);
            i++;
        }
/*        ADDITION METHOD
        i=1;
        int x=0;
        while(i<=10){
            x+=num;
            System.out.print("\n"+num+" x "+i+" = "+x);
            i++;
        }*/
    }
}
