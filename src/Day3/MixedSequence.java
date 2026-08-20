package Day3;

import java.util.Scanner;
public class MixedSequence {
    static void main(){
        System.out.print("We are printing a Sequence, 1, n, 2, n-1, 3, n-2, 4..........\n Input n  : ");
        Scanner s;
        s= new Scanner(System.in);
        int n= s.nextInt();
        int x=n;
        for (int i=1;i<=n; i++){
            System.out.println(i+"\n"+x);
            x--;
        }
    }
}
