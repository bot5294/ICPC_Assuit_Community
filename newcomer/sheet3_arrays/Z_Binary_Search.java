import java.util.*;
public class Z_Binary_Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        while(q>0){
            long key = sc.nextLong();
            int l=0;
            int r=n-1;
            int mid = (l+r)/2;
            while(l<=r){
                if(arr[mid]==key){
                    System.out.println("found");
                    break;
                }else if(arr[mid]>key){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
                mid=(l+r)/2;
            }

            if(l>r)
                System.out.println("not found");
            q--;
        }
        sc.close();
    }
}