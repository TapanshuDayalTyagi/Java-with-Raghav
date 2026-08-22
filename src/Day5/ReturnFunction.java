package Day5;


import java.util.Scanner;
public class ReturnFunction {
    static void main(String[] args){
        /*
        * void --> perform something and terminate
        * return type --> execute and return some sort of data (as per data-type of function)
        *                       And function holds and behaves like a variable holding value(returned after execution)
         */
        Scanner x = new Scanner(System.in);
       String z = name(x);
        System.out.println("Heartily Welcome to you here, "+z);
        System.out.print(personal(x));
    }

    static String name(Scanner x){
        System.out.print(" Name : ");
        return (x.nextLine());
    }
    static String personal(Scanner x){
        String papa  = papa(x);
        String mammy = mammy(x);
        int age = age(x);
        System.out.println("Just verify the details once,");
        return("Age = "+age+"\nFather's name : "+papa+"\nMother's name : "+mammy);
//        return data;

    }

    public static String papa(Scanner x) {
        System.out.print("Father's Name : ");
        return (x.nextLine());
    }
    public static String mammy(Scanner x) {
        System.out.print("Mother's Name : ");
        return (x.nextLine());
    }

    public static int age(Scanner x) {
        System.out.print("Age : ");
        return x.nextInt();

    }

}
