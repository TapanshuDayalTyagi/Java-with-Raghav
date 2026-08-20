package Day3;

public class Print0to18 {
    static void main(){
        System.out.println("Here printing count from 0 to 18\nFor loop");
        for (int i = 0; i <=18 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("\n\nWhile Loop");
        int x=0;
        while(x<=18){
            System.out.print(x+" ");
            x++;
        }
        x=0;
        System.out.println("\n\ndo-While Loop");
        do{
            System.out.print(x+" ");
            x++;
        }while(x<=18);
    }
}
