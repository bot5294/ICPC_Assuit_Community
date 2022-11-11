import java.util.*;
/**
 * M_Capital_or_Small_or_Digit
 */
public class N_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        int ix = (int)x;
        if(ix>94){
            System.out.println((char)(ix-32));
        }else{
            System.out.println((char)(ix+32));
        }
        sc.close();
    }
}