import java.util.*;
/**
 * Z_Hard_Compare
 */
public class Z_Hard_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        double exp = d/(double)b;
        long val2 = (long) (Math.pow(c,exp));
        if(a>val2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}