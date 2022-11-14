import java.util.*;
public class W_Shape_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int si=n-1;
        int se=0;
        int sti=1;
        int ste=2*n-1;
        while(n>0){
            // print space
            if(si>se)
            for(int i=si;i>0;i--){
                System.out.print(" ");
            }
            si--;
            // print star
            if(sti<=ste)
            for(int i=1;i<=sti;i++){
                System.out.print("*");
            }
            System.out.println();
            sti+=2;
            n--;
        }
        si=0;
        se=m;
        sti=2*m-1;
        ste=1;
        while(m>0){
            if(se>si)
            for(int i=si;i>0;i--)
                System.out.print(" ");
            si++;

            if(sti>=ste)
            for(int i=sti;i>=ste;i--)
                System.out.print("*");
            System.out.println();
            sti-=2;
            m--;
        }
        sc.close();
    }
}