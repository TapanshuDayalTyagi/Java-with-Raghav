package Day2;

import java.util.Scanner;

//check for the taken length and breadth of a Rectangle, is Parameter < area ???
public class RECTparaGTarea {
    static void main(){
        double length, breadth,parameter, area;
        System.out.print("Calculating the area and parameter of a Rectangle \n Length : ");
        Scanner m;
        m = new Scanner(System.in);
        length= m.nextDouble();
        System.out.print("Breadth : ");
        breadth = m.nextDouble();
        parameter= 2*(length+breadth);
        area = length * breadth;
        if (area==parameter)
            System.out.print("Yeah,  Area and parameter of Rectangle with sides "+length+" and "+breadth+" are SAME.. ."+area);
        else
            System.out.print("Ooops, parameter and Area both are different \n parameter  : "+parameter+",   area : "+area);
    }
}
