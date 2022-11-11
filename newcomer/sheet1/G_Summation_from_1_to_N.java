import java.util.*;

/**
 * G_Summation_from_1_to_N
 */
public class G_Summation_from_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = (n*(n+1))/2;
        System.out.println(n);
        sc.close();
    }
}