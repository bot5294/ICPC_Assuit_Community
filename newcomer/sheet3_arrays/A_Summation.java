import java.util.*;
public class A_Summation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // long arr[] = new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
            sum+= sc.nextLong();
        System.out.println(sum>0?sum:-1*sum);
        sc.close();
    }
}