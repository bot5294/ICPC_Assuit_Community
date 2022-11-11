import java.util.*;

/**
 * K_Max_and_Min
 */
public class K_Max_and_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long min = Math.min(a,b);
        min = Math.min(min,c);
        long max = Math.max(a,b);
        max = Math.max(max,c);
        System.out.println(min+" "+max);
        sc.close();
    }
}