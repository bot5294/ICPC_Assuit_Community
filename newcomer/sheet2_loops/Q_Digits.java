import java.util.*;
public class Q_Digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            String d = sc.next();
            for(int i=d.length()-1;i>=0;i--){
                System.out.print(d.charAt(i)+" ");
            }
            System.out.println();
            n--;
        }
        sc.close();
    }
}