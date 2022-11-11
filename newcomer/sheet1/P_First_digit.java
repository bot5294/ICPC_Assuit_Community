import java.util.*;
/**
 * P_First_digit
 */
public class P_First_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int fd = Integer.parseInt(x.charAt(0)+"");
        if(fd%2==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}