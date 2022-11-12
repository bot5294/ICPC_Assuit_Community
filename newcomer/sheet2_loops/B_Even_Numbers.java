import java.util.*;
/**
 * B_Even_Numbers
 */
public class B_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n;i=i+2){
            System.out.println(i);
            flag=true;
        }
        if(!flag){
            System.out.println(-1);
        }
        sc.close();
    }
}