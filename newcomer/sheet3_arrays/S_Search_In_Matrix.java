import java.util.*;
public class S_Search_In_Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==x){
                    System.out.println("will not take number");
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("will take number");
        sc.close();
    }
}