import java.util.*;

public class D_Difference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long x = (a*b)-(c*d);
        System.out.println("Difference = "+x);
        sc.close();
    }
}