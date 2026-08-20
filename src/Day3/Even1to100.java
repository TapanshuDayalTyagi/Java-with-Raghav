package Day3;

import java.util.Scanner;

public class Even1to100 {
    static void main(){
        System.out.print("Printing Evens from 1 to n,,,\n n => ");
        Scanner m;
        m= new Scanner(System.in);
        int n= m.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print(i%2==0? i :" ");
        }

    }
}
