import java.util.*;
/**
 * J_Multiples
 */
public class J_Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a%b==0 || b%a==0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
        sc.close();
    }
}