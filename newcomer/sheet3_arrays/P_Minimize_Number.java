import java.util.*;
public class P_Minimize_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean areAllEven = true;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
                areAllEven=false;
        }
        if(!areAllEven){
            System.out.println(0);
            sc.close();
            return;
        }
        long count=0;
        while(areAllEven){
            count++;

            for(int i=0;i<n;i++){
                arr[i]=arr[i]/2;
                if(arr[i]%2!=0)
                    areAllEven=false;
            }
        }
        System.out.println(count);
        sc.close();
    }
}