import java.util.*;
public class T_Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int pSum=0;
        int sSum=0;
        int k = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    // System.out.print("p:"+arr[i][j]+" ");
                    pSum+=arr[i][j];
                }
                if(j==k){
                    // System.out.print("s:"+arr[i][j]+" ");
                    sSum+=arr[i][j];
                }
            }
            k--;
        }
        System.out.println(Math.abs(pSum-sSum));
        sc.close();
    }
}