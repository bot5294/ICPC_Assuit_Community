import java.util.*;
public class F_Way_Too_Long_Words{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            int n1 = s.length();
            if(n1<=10){
                System.out.println(s);
            }else{
                System.out.println(s.charAt(0)+""+(n1-2)+""+s.charAt(n1-1));
            }
            t--;
        }
        sc.close();
    }
}