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
            // int arr[] = new int[];
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    int max=Integer.MIN_VALUE;
                    for(int k=i;k<=j;k++){
                        // System.out.print(arr[k]+" |");
                        if(arr[k]>max)
                            max=arr[k];
                    }
                    System.out.print(max+" ");
                }
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}