import java.util.*;
public class U_Is_B_a_subsequence_of_A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int brr[] = new int[m];
        for(int i=0;i<m;i++){
            brr[i]=sc.nextInt();
        }
        int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(;j<m;){
                if(arr[i]==brr[j]){
                    count++;
                    j++;
                    break;
                }else{
                    break;
                }    
            }
        }
        if(count==brr.length){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}