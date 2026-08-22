package Day5;
import java.util.Scanner;
public class FunctionUsage {
    static void main() {
        System.out.println("Its MAIN Function");
        Scanner s = new Scanner(System.in);
        System.out.print("Input value to print count upto ");
        int x = s.nextInt();
        count(x);
    }
    static void count(int x){
        System.out.println("\n1st fumction\n");
        for (int i = 1; i <= x; i++) {
            System.out.print(i+" ");
        }
        terminate();
    }
    static void terminate(){
        System.out.print("2nd function ");
    }
}
