import java.util.*;
public class U_Some_Sums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
                int d=i;
                int isum=0;
                while(d>0){
                    isum+=d%10;
                    d=d/10;
                }
                if(isum>=a && isum<=b)
                    sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}