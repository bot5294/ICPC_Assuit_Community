import java.util.*;
public class L_Max_Subarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]);
                    }
                    System.out.println();
                }
            }
        //     int count=0;
        //     while(count<n){ // 0 1 2 3
        //         int max=Integer.MIN_VALUE;
        //         for(int i=0,j=i+count;i<n&&j<n;i++,j++){
        //             for(int k=i;k<=j;k++){
        //                 System.out.println(arr[k]+" | ");
        //             if(arr[k]>max)
        //                     max=arr[k];
        //         }
        //         System.out.print(max+" ");
        //     }
        //     count++;
        // }
            // System.out.println();
            t--;
        }
        sc.close();
    }
}