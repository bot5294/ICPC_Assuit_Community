import java.util.*;
public class I_Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rsb = new StringBuilder(sb.reverse());
        if(rsb.toString().equals(s)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}