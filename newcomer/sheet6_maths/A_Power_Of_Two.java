import java.util.*;
public class A_Power_Of_Two{
    public static boolean isPOTwo(long n){
        // System.out.println(n);
        // for(long i = 0 ; i < 64;i++) checking bit value of every digit
        // System.out.print((n>>i)&1);
        // System.out.println();
        // for(long i = 0 ; i < 64;i++)
        // System.out.print(((n-1)>>i)&1);
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(isPOTwo(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}