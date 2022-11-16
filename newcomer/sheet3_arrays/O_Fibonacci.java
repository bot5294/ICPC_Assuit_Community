import java.util.*;
public class O_Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fib1=0;
        long fib2=1;
        if(n<=1){
            System.out.print(fib1);
            sc.close();
            return;
        }
        for(int i=3;i<=n;i++){
            long fib = fib1+fib2;
            fib1=fib2;
            fib2=fib;
        }
        System.out.print(fib2);
        sc.close();
    }
}