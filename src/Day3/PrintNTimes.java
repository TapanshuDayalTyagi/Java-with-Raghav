package Day3;

import java.util.Scanner;

public class PrintNTimes {
    static void main(){
        System.out.print("Share your name and number of times it to be printed......\nName :> ");
                Scanner m;
        m =new Scanner(System.in);
        String name= m.nextLine();
        System.out.print("Iterations :> ");
        int x = m.nextInt();
        int i=1;
        while(i<=x){
            System.out.println(i +". "+name );
            i++;
        }
    }
}
