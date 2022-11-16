import java.util.*;
public class M_Replace_MinMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int minIndex=0;
        int maxIndex=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }else if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex]=arr[maxIndex];
        arr[maxIndex]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}