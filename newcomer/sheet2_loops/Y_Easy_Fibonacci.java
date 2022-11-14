import java.util.*;
public class Y_Easy_Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib1=0;
        int fib2=1;
        int fib;
        for(int i=1;i<=n;i++){
            fib=fib2+fib1;
            System.out.print(fib1+" ");
            fib1=fib2;
            fib2=fib;
        }
        sc.close();
    }
}