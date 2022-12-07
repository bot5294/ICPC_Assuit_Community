import java.util.*;
public class K_Shift_Right{
    public static void shiftXTimes(int arr[],int k){
        int n = arr.length;
        if (k < 0 || k % n==0) {
            return;
        }
        k=k%n;
        int[] aux = new int[k];
        for (int i = 0; i < k; i++) {
            aux[i] = arr[n - k + i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = aux[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        shiftXTimes(arr,x);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}