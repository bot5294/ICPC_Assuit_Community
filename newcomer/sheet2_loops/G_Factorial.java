import java.util.*;
public class G_Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            long d = sc.nextLong();
            long fact=1;
            for(int i=2;i<=d;i++){
                fact*=i;
            }
            System.out.println(fact);
            n--;
        }
        sc.close();
    }
}