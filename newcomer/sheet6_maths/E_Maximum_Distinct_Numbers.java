import java.util.*;
public class E_Maximum_Distinct_Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = (long)(-1+Math.sqrt(1+8*n))/2;
        System.out.println(ans);
        sc.close();
    }
}