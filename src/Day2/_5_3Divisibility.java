package Day2;
import java.util.Scanner;

public class _5_3Divisibility {
    static void main() {
        System.out.print("Input an Integer Value to find its divisibility by 5 _ 3\n number : ");
        Scanner m;
        m= new Scanner(System.in);
        int n= m.nextInt();

/*     INDIVIDUAL CONDITIONALS
         if (n%3==0 && n%5==0)
            System.out.print(n+" is divisible by both 3 and 5");
        else if (n%3==0)
            System.out.print(n+ " is divisible only by 3");
        else if (n%5==0)
            System.out.print(n+ " is divisible only by 5");
        else
            System.out.print(n+ " is Neither divisible by 3 nor 5");   */

        //NESTED CONDITIONALS
        if (n%3==0){
            if (n%5==0)
                System.out.print(n+ " is divisible by both 3 and 5");
            else
                System.out.print(n+ " is only divisible by 3");
        }
        else{
            if (n%5==0)
                System.out.print(n+ " is only divisible by 5");
            else
                System.out.print(n+ " is neither divisible by 3 nor 5");
        }

    }
}
