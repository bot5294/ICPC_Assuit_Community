import java.util.*;
public class Y_Range_sum_query{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long arr[] = new long[n];
        long srr[] = new long[n+1];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        srr[0]=0;
        // System.out.print(srr[0]+" ");
        for(int i=1;i<=n;i++){
            srr[i] += srr[i-1]+arr[i-1]; 
            // System.out.print(srr[i]+" ");
        }
        // System.out.println();
        while(q>0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            long sum = srr[r]- srr[l-1];
            System.out.println(sum);
            q--;
        }
        sc.close();
    }
}