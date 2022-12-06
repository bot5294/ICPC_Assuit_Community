import java.util.*;
public class F_Equation{
    public static long getPow(int x,int i){
        long prod=1;
        for(int z=0;z<i;z++){
            prod*=x;
        }
        return prod;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long sum =0;
        if(x==0){
            System.out.println(x);
        }else{
            for(int i=2;i<=y;i+=2){
                sum+= getPow(x,i);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}