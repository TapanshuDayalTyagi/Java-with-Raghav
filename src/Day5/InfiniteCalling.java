package Day5;

public class InfiniteCalling {
    static void main(){
        System.out.println("main  function .......\nINFINITE LOOP starts\n");
        a();
    }

    static void a(){
        System.out.println("Function A");
        b();
    }

     static void b() {
        System.out.println("Function B");
        c();
    }
    static void c() {
        System.out.println("Function C\n__________");
        a();
    }
}
