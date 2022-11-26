import java.util.*;
public class E_Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int n = s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+= Integer.parseInt(s.charAt(i)+"");
        }
        System.out.println(sum);
        sc.close();
    }
}