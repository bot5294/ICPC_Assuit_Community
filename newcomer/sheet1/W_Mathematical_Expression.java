import java.util.*;
/**
 * W_Mathematical_Expression
 */
public class W_Mathematical_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        char s = sc.next().charAt(0);
        long b = sc.nextLong();
        char q = sc.next().charAt(0);
        long c = sc.nextLong();
        boolean ans = false;
        long rans=0;
        switch(s){
            case '+':
            ans = (a+b)==c;
            if(!ans)
                rans=a+b;
            break;
            case '-':
            ans = (a-b)==c;
            if(!ans)
                rans=a-b;
            break;
            case '*':
            ans = (a*b)==c;
            if(!ans)
                rans=a*b;
            break;
        }
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println(rans);
        }
        sc.close();
    }
}