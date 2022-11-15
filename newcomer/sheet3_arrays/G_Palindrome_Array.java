import java.util.*;
public class G_Palindrome_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int mid = n%2==0?n/2:n/2+1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0,j=n-1;i<=mid && j>=mid;i++,j--){
            if(arr[i]!=arr[j]){
                System.out.println("NO");
                sc.close();
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}