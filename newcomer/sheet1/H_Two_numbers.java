import java.util.*;

/**
 * H_Two_numbers
 */
public class H_Two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        double x = a/(double)b;
        System.out.println("floor "+a+" / "+b+" = "+(int)Math.floor(x));
        System.out.println("ceil "+a+" / "+b+" = "+(int)(Math.ceil(x)));
        System.out.println("round "+a+" / "+b+" = "+Math.round(x));
        sc.close();
    }
}