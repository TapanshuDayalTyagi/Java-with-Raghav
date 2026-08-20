package Day2;

import java.util.Scanner;
public class GreatestOf3 {
    static void main(){
        System.out.print("Input 3 Integer to get the Largest of them...\n Number 1 : ");
        Scanner m;
        m = new Scanner(System.in);
        int n1,n2,n3;
        n1=m.nextInt();
        System.out.print("Number 2 : ");
        n2= m.nextInt();
        System.out.print("Number 3 : ");
        n3= m.nextInt();

//        NESTED CONDITIONALS
/*        if (n1>n2){
            if (n1>n3)
                System.out.print(n1+" is the greatest of all ");
            else
                System.out.print(n3+" is the greatest of all ");
        }
        else {
            if (n2>n3)
                System.out.print(n2+" is the greatest of all ");
            else
                System.out.print(n3+" is the greatest of all ");
        }
 */
//        INDEPENDENT CONDITIONALS
        if (n1>n2 && n1>n3)
            System.out.print(n1+ " is the greatest of all ");
        else if(n2>n1 && n2>n3)
            System.out.print(n2+ " is the greatest of all ");
        else
            System.out.print(n3+ " is the greatest of all ");
        m.close();
    }
}
