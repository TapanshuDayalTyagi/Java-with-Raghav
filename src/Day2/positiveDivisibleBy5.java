package Day2;

import java.util.Scanner;

public class positiveDivisibleBy5 {
    static void main() {
        System.out.print("Input a Positive integer to check its divisibility by 5......\nnumber : ");
        Scanner m;
        m = new Scanner(System.in);
        int num = m.nextInt();
        if (num>=0){
            if (num%5==0)
                System.out.print(num+" is divisible by 5");
            else
                System.out.println(num+" is NOT divisible by 5");
        }
        else
            System.out.print("Invalid Input \n| Enter POSITIVE |");
        m.close();
    }
}
