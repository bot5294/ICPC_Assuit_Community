import java.util.*;
public class K_Sum_Digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String d = sc.next();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(d.charAt(i)+"");
        }
        System.out.println(sum);
        sc.close();
    }
}