import java.util.*;
/**
 * V_Comparison
 */
public class V_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char s = sc.next().charAt(0);
        int b = sc.nextInt();
        boolean ans=false;
        switch(s){
            case '>':
            ans = a>b;
            break;
            case '<':
            ans = a<b;
            break;
            case '=':
            ans = a==b;
            break;
        }
        if(ans){
            System.out.println("Right");
        }else{
            System.out.println("Wrong");
        }
        sc.close();
    }
}