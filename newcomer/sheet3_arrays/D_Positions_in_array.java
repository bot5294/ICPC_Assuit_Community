import java.util.*;
public class D_Positions_in_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<=10)
                System.out.println("A["+i+"] = "+arr[i]);
        }
        sc.close();
    }
}