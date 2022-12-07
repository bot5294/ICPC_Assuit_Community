import java.util.*;
public class L_New_Array{
    public static void printConcatenation(int arr[],int brr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
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
        printConcatenation(arr,brr);
        sc.close();
    }
}