import java.util.*;
public class C_Even_Odd_Positive_and_Negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ne=0;
        int no=0;
        int np=0;
        int nn=0;
        for(int i=0;i<arr.length;i++){
            int d=arr[i];
            if(d>0){
                np++;
            }else if(d<0){
                nn++;
            }
            if(d%2==0){
                ne++;
            }else{
                no++;
            }
    }
    System.out.println("Even: "+ne);
    System.out.println("Odd: "+no);
    System.out.println("Positive: "+np);
    System.out.println("Negative: "+nn);
    sc.close();
    }
}