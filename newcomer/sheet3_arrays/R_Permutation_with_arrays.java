import java.util.*;
public class R_Permutation_with_arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int brr[] = new int[n];
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        boolean isPermutation=true;
        for(int i=0;i<n;i++){
            boolean isEqual=false;
            for(int j=0;j<n;j++){
                if(brr[i]==arr[j])
                    isEqual=true;
            }
            if(!isEqual)
                isPermutation=false;
        }
        System.out.println(isPermutation?"yes":"no");
        sc.close();
    }
}