import java.util.*;
public class V_PUM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int x=3;
        while(n>0){
            for(;i<=x;i++)
                System.out.print(i+" ");
            System.out.println("PUM");
            x+=4;
            i++;
            n--;
        }
        sc.close();
    }
}