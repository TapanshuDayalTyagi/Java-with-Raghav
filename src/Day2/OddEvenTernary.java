package Day2;

import java.util.Scanner;

public class OddEvenTernary {
    static void main(){
        int n;
        System.out.print("Input Integer to find it Even or Odd using TERNARY operator\n number : ");
        Scanner m;
        m = new Scanner(System.in);
        n = m.nextInt();
        String a= (n%2==0)? "Even": "Odd";
//        System.out.print((n%2==0)?"Even": "Odd");

        System.out.print(n+" is "+a);

    }
}
