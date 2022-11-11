import java.util.*;
/**
 * O_Calculator
 */
public class O_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        int a=0;
        char s='a';
        int b=0;
        for(int i=0;i<q.length();i++){
            char val = q.charAt(i);
            if(val=='+'||val=='-'||val=='*'||val=='/'){
                s=val;
                b = Integer.parseInt(q.substring(i+1));
                a = Integer.parseInt(q.substring(0,i));
                break;
            }

        }
        String ans="";
        int t;
        switch(s){
            case '+':
            t = a+b;
            ans = t+"";
            break;
            case '-':
            t = a-b;
            ans = t+"";
            break;
            case '*':
            t = a*b;
            ans = t+"";
            break;
            case '/':
            t = a/b;
            ans = t+"";
            break;
        }
        System.out.println(ans);
        sc.close();
    }
}