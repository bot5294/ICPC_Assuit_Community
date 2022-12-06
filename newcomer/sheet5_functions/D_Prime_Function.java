import java.util.*;
public class D_Prime_Function{
    public static String isPrime(long n){
        if(n==1)
            return "NO";
        for(long i=2;i*i<=n;i++){
            if(n%i==0)
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            System.out.println(isPrime(n));
        }
        sc.close();
    }
}