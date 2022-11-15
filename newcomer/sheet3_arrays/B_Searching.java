import java.util.*;
public class B_Searching{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long x = sc.nextLong();
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.println(i);
                sc.close();
                return;
            }       
        }
        System.out.println(-1);
        sc.close();
    }
}