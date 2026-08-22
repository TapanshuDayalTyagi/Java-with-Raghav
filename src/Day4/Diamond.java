package Day4;

import java.util.Scanner;
public class Diamond {
    static void main(){
        System.out.print("Printing a Diamond Pattern...\n Size :> ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x%2==0) x++;
        int mid =x/2,gap,col=0;

        for (int i = 0; i < x; i++) {


            if (i>mid) gap=i-mid;
            else gap=mid-i;
            for (int j = 0; j < gap; j++) {
                System.out.print("     ");
            }

            int pattern=0;
            while(pattern < 2*col+1){
                System.out.print("  0 ");
                pattern++;
            }
                if(i<mid) col++;
                else col--;
            System.out.println(" ");
        }
    }
}
