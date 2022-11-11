import java.util.*;

/**
 * I_Welcome_for_you_with_Conditions
 */
public class I_Welcome_for_you_with_Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}