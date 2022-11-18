import java.util.*;
public class V_Frequency_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Math.max(n,m);
        int freq[] = new int[max+1];
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            freq[val]= freq[val]==0?1:freq[val]+1;
        }
        for(int j=1;j<=m;j++){
            if(freq[j]>0)
                System.out.println(freq[j]);
        }
        sc.close();
    }
}