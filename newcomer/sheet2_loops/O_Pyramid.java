import java.util.*;
public class O_Pyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start=1;
        while(start<=n){
            for(int i=0;i<start;i++)
                System.out.print("*");
            System.out.println();
            start++;
        }
        sc.close();
    }
}