package Day3;

import java.util.Scanner;

public class CompositePrime {
    static void main() {
        System.out.print("Enter a number to know whether its Composite or not..\n Number :> ");
        int fact = 0;
        Scanner s;
        s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                fact++;
                break;
            }
        }

        if (fact == 0)
            System.out.print(num + " is a PRIME number");
        else
            System.out.print(num + " is a COMPOSITE Number...");
    }
}
