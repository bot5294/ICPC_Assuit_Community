import java.util.*;
public class T_Shape_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        sc.close();
    }
}