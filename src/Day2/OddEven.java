package Day2;
import java.util.Scanner;
public class OddEven {
    static void main() {
        System.out.print("Enter a positive Integer (Odd/ Even???)\n num : ");
        Scanner nm = new Scanner(System.in);
        int num = nm.nextInt();

        if (num<0)
            System.out.print("Invalid Input!!!!\n | POSITIVE is required |");

        else{
            if (num%2==0)
                System.out.print(num+" is EVEN");

            else
                System.out.print(num+" is ODD");
        }
    }
}
