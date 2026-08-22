package Day4;

import java.util.Scanner;
public class Rectangle {
    static void main(){
        System.out.print("Provide the dimensions of the Rectangle pattern to be printed, \nHeight : ");
        Scanner s;
        s = new Scanner(System.in);
        int height =s.nextInt();
        System.out.print("Width : ");
        int width = s.nextInt();
        for(int i=0; i<height; i++){
            for (int j=0; j< width ; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
