import java.util.*;
/**
 * Y_The_last_2_digits
 */
public class Y_The_last_2_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long mul = a*b;
        long f2 = mul%100;
        mul = c*d;
        long s2 = mul%100;
        mul = f2*s2;
        System.out.println(mul%100<9?"0"+mul%100:mul%100);
        sc.close();
    }
}