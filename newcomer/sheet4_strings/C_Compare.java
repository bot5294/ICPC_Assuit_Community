import java.util.*;
public class C_Compare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        if(x.equals(y)){
            System.out.println(x);
            sc.close();
            return;
        }
        int n1 = x.length();
        int n2 = y.length();
        int min = Math.min(n1,n2);
        boolean isPrinted=false;
        for(int i=0;i<min;i++){
            int c1 = (int) x.charAt(i);
            int c2 = (int) y.charAt(i);
            if(c1<c2){
                System.out.println(x);
                isPrinted=true;
                break;
            }else if(c1>c2){
                System.out.println(y);
                isPrinted=true;
                break;
            }
        }
        if(!isPrinted)
        System.out.println(min==n1?x:y);
        sc.close();
    }
}