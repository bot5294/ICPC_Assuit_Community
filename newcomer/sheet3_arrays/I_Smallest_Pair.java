import java.util.*;
public class I_Smallest_Pair{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sum=Integer.MAX_VALUE;
            for(int i=1;i<=n;i++){
                for(int j=i+1;j<=n;j++){
                    if(i<j){
                    int tsum = arr[i-1]+arr[j-1]+j-i;
                    // System.out.println(arr[i-1]+" + "+arr[j-1]+" + "+j+"-"+i+" = "+tsum);
                    if(tsum<sum)
                        sum=tsum;
                    }
                }
            }
            System.out.print(sum);
            t--;
        }
        sc.close();
    }
}