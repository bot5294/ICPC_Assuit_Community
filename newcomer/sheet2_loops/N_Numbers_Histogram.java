import java.util.*;
public class N_Numbers_Histogram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        int n = sc.nextInt();
        while(n>0){
            int d = sc.nextInt();
            for(int i=0;i<d;i++)
                System.out.print(s);
            System.out.println();
            n--;
        }
        sc.close();
    }
}