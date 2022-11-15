import java.util.*;
public class J_Lucky_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min) min=arr[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==min) count++;
        }
        if(count%2==0){
            System.out.println("Unlucky");
        }else{
            System.out.println("Lucky");
        }
        sc.close();
    }
}