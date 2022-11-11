import java.util.*;
/**
 * M_Capital_or_Small_or_Digit
 */
public class M_Capital_or_Small_or_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        int ix = (int)x;
        if(ix>=48 && x<=57){
            System.out.println("IS DIGIT");
        }else if(x>=65 && x<=90){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }else if(x>=97 && x<= 122){
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
        sc.close();
    }
}