import java.util.*;

public class F_Digits_Summation {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    System.out.println((a%10)+(b%10));
    sc.close();
    }
}