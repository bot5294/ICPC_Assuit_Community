import java.util.*;
public class H_N_Times{
    public static void printNTimes(int n,char c){
        for(int i=0;i<n;i++){
            System.out.print(c+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            printNTimes(n,c);
        }
        sc.close();
    }
}