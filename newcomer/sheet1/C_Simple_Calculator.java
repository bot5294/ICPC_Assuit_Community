import java.util.*;

public class C_Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println(x+" * "+y+" = "+(x*y));
        System.out.println(x+" - "+y+" = "+(x-y));
        sc.close();
    }
}