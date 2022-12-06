import java.util.*;
public class I_Swapping_With_Matrix{
    public static void swapC(int x,int y,int arr[][]){
        for(int i=0;i<arr[0].length;i++){
            int temp = arr[x][i];
            arr[x][i]=arr[y][i];
            arr[y][i]=temp;
        }
    }
    public static void swapR(int x,int y,int arr[][]){
        for(int i=0;i<arr.length;i++){
            int temp = arr[i][x];
            arr[i][x]=arr[i][y];
            arr[i][y]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        swapR(x,y,arr);
        swapC(x,y,arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}