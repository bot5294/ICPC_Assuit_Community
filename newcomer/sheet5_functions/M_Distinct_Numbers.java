import java.util.*;
public class M_Distinct_Numbers{
    public static int distinctNum(int arr[]){
        int n = arr.length;
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(distinctNum(arr));
        sc.close();
    }
}