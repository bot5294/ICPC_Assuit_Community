import java.util.*;
public class G_Max_and_MIN{
    public static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println(min+" "+max);
        sc.close();
    }
}