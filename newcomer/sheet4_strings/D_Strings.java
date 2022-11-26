import java.util.*;
public class D_Strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n1 = a.length();
        int n2 = b.length();
        System.out.println(n1+" "+n2);
        System.out.println(a+b);
        System.out.println(b.charAt(0)+a.substring(1)+" "+a.charAt(0)+b.substring(1));
        sc.close();
    }
}