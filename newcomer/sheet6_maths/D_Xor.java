import java.util.*;
public class D_Xor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long q = sc.nextLong();
        if(q==1){
            System.out.println(a);
        }else if(q==2){
            System.out.println(b);
        }else{
            int ans = (int)(q % 3);
            if(ans==0){
                System.out.println(a^b);
            }else if(ans==1){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }
        sc.close();
    }
}