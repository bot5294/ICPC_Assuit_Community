import java.util.*;
public class Q_Count_Subarrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                boolean isDec = true;
                for(int j=i;j<n;j++){
                    for(int k=i;k<j;k++){
                        if(arr[k]>arr[k+1]){
                            isDec = false;
                        }
                    }
                    if(isDec)
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}