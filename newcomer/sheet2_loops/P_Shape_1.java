import java.util.*;
public class P_Shape_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            for(int i=0;i<n;i++)
                System.out.print("*");
            System.out.println();
            n--;
        }
        sc.close();
    }
}