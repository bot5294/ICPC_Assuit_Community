import java.util.*;
public class L_Max_Subarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int max = Integer.MIN_VALUE;
                for(int j=i;j<n;j++){
                    if(arr[j]>max)
                        max=arr[j];
                    System.out.print(max+" ");
                }
            }
            t--;
        }
        sc.close();
    }
}