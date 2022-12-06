import java.util.*;
public class J_Average{
    public static void printAvg(double arr[]){
        int n = arr.length;
        double sum=0f;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        sum = sum/n;
        System.out.printf("%.7f", sum);        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
        }
        printAvg(arr);
        sc.close();
    }
}