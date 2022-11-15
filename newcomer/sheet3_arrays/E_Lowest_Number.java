import java.util.*;
public class E_Lowest_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int lowest=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<lowest){
                lowest=arr[i];
                pos=i+1;
            }
        }
        System.out.print(lowest+" "+pos);
        sc.close();
    }
}