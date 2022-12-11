import java.util.*;
public class B_Prime_checking{
    public static String isPrime(long n){
        if(n==2) return "YES";
        if(n<2 || n%2==0) return "NO";
        for(long i=3;i*i<=n;i+=2){
            if(n%i==0)
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n==1){
            System.out.println("NO");
            sc.close();
            return;
        }
        System.out.println(isPrime(n));
        sc.close();
    }
}