import java.util.*;
public class K_I_Love_strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc>0){
            String s = sc.next();
            String t = sc.next();
            int n1=s.length();
            int n2 = t.length();
            int min = Math.min(n1,n2);
            for(int i=0;i<min;i++){
                System.out.print(s.charAt(i)+""+t.charAt(i));
            }
            if(n1>min){
                System.out.print(s.substring(min));
            }else if(n2>min){
                System.out.print(t.substring(min));
            }
            System.out.println();
            tc--;
        }
        sc.close();
    }
}