import java.util.*;
/**
 * R_Age_in_Days
 */
public class R_Age_in_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = n/365;
        int m = (n%365)/30;
        int d = (n%365)%30;
        System.out.println(y+" years");
        System.out.println(m+" months");
        System.out.println(d+" days");
        sc.close();
    }
}