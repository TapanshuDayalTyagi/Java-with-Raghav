package Day2;

import java.util.Scanner;

public class ProfitLoss {
    static void main() {
        double cp, sp;
        System.out.print("For a item sold, provide it's \nCost Price : ");
        Scanner m;
        m= new Scanner(System.in);
        cp =m.nextDouble();
        System.out.print("Selling Price : ");
        sp=m.nextDouble();

        if (cp==sp)
            System.out.print("No Loss - No Profit ");
        else if(sp>cp)
            System.out.print("PROFIT amount is " + (sp-cp)+"\n"+ (sp-cp)*100/cp +"% Profit ");
        else
            System.out.print("LOSS amount is " + -(sp-cp)+"\n"+ -(sp-cp)*100/cp + "% Loss ");


        m.close();
    }
}
