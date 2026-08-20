package Day2;

import java.util.Scanner;

//Magnitude less than 69
public class magLT69 {
    static void main(){
        System.out.print("A number having magnitude less than 69, \n number : ");
        Scanner m;
        m =new Scanner(System.in);
        int x= m.nextInt();
        if (x<0)
            x=-x;
        if (x <69)
            System.out.print(x+ " have less magnitude than 69");
        else
            System.out.print("Ooops, " +x+ " has more magnitude than 69");
        m.close();
    }
}
