
import java.util.*;
public class R_Permutation_with_arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // int afrr[] = new int[10000005];
        // int bfrr[] = new int[10000005];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            // afrr[arr[i]]= afrr[arr[i]]==0?1:afrr[arr[i]]++;
        }
        Arrays.sort(arr);
        int brr[] = new int[n];
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
            // bfrr[brr[i]]= bfrr[brr[i]]==0?1:bfrr[brr[i]]++;
        }
        Arrays.sort(brr);
        boolean isPermutation=true;
        for(int i=0;i<n;i++){
            if(arr[i] != brr[i])
                isPermutation=false;
        }

        
        // for(int i=0;i<n;i++){
        //     // System.out.println("afrr,bfrr : arr,brr "+afrr[arr[i]]+" , "+bfrr[arr[i]]+" : "+arr[i]+" , "+brr[i]);
        //     if(afrr[arr[i]] != bfrr[arr[i]]){
        //         isPermutation=false;
        //         break;
        //     }
        // }
        System.out.println(isPermutation?"yes":"no");
        sc.close();
    }
}