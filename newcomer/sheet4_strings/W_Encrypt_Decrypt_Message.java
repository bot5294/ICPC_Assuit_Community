import java.util.*;
public class W_Encrypt_Decrypt_Message{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String s = sc.next();
        int n =s.length();
        String key ="PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
        String or = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if(q==1){
            for(int i=0;i<n;i++){
                char x = s.charAt(i);
                System.out.print(key.charAt(or.indexOf(x)));
            }
        }else{
            for(int i=0;i<n;i++){
                char y = s.charAt(i);
                System.out.print(or.charAt(key.indexOf(y)));
            }
        }
        sc.close();
    }
}