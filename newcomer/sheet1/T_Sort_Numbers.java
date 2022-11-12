import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
/**
 * T_Sort_Numbers
 */
public class T_Sort_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        min = Math.min(min,c);
        int max = Math.max(a,b);
        max = Math.max(max,c);
        System.out.println(min);
        int mid=-1;
        if(a>min && a<max){
            mid=a;
        }else if(b>min && b<max){
            mid=b;
        }else if(c>min && c<max){
            mid=c;
        }else if(a==b){
            mid=a;
        }else if(b==c){
            mid=c;
        }else if(a==c){
            mid=a;
        }
        System.out.println(mid);
        System.out.println(max);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}