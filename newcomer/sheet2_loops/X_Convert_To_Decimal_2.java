import java.util.*;
public class X_Convert_To_Decimal_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            long x = sc.nextLong();
            long bin=0;
            // long count=0;
            while(x>0){
                long d = x%2;
                if(d==1)
                bin++;
                x/=2;
            }
            long ans=0;
            long base=1;
            for(int i=0;i<bin;i++){
                ans = ans+base;
                base*=2;
            }
            System.out.println(ans);
            n--;
        }
        sc.close();
    }
}