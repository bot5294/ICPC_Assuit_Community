import java.util.*;
public class V_Frequency_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int max = Math.max(n,m);
        int freq[] = new int[m+1];
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(freq[arr[i]]==0){
                freq[arr[i]]=1;
            }else{
                freq[arr[i]]+=1;
            }
        }
        for(int j=1;j<=m;j++){
            System.out.println(freq[j]);
        }
        sc.close();
    }
}