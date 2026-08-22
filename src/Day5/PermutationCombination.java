package Day5;

import java.util.Scanner;

public class PermutationCombination {
    static void main() {
        System.out.println("Permutation or Combination ??? \nInput p or c");
        Scanner x = new Scanner(System.in);
        char select = x.next().charAt(0);
        System.out.print("n = ");
        int n = x.nextInt();
        System.out.print("r = ");
        int r = x.nextInt();

        if (select=='c' || select == 'C'){
            System.out.println(n+" C "+r+" is "+combination(n,r));
        }
        else if (select=='p' || select == 'P'){
            System.out.println(n+" P "+r+" is "+permutation(n,r));
        }
    }
    static int fact(int a){
        int f=1;
        for (int i = a; i >1 ; i--) {
            f*=i;
        }
        System.out.println("fact of "+a+" is "+f);
        return f;
    }
    static int combination(int n, int r){
        return fact(n) / (fact(n-r) * fact(r));
//        System.out.println("a/bc ="+a/(b*c));
    }
    static int permutation(int n, int r){
        return fact(n)/fact(n-r);
//        System.out.println("a/b = "+a/b);
    }
}
