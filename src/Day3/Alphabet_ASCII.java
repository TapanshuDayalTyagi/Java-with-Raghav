package Day3;

import java.util.Scanner;
public class Alphabet_ASCII {
    static void main(){
        System.out.print("We are printing the Alphabets with their corresponding ASCII Values\n from :> ");
        Scanner s;
        s = new Scanner(System.in);
        char from= s.next().charAt(0);
        System.out.print("To :> ");
        char to = s.next().charAt(0);
        for (char x=from;x<=to;x++){
            System.out.println((int)x + "      ->      "+x );
        }
    }
}
