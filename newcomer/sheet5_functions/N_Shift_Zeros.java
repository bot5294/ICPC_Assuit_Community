import java.util.*;
public class N_Shift_Zeros{
    public static void shiftArr(int arr[]){
        int n = arr.length;
        ArrayList<Integer> brr = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                brr.add(arr[i]);
        }
        for(int i=0,k=0;i<n;i++,k++){
            if(k<brr.size()){
                arr[i]=brr.get(i);
            }else{
                arr[i]=0;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        shiftArr(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}