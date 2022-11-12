import java.util.*;
/**
 * X_Two_intervals
 */
public class X_Two_intervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l1 =sc.nextLong();
        long r1 =sc.nextLong();
        long l2 =sc.nextLong();
        long r2 =sc.nextLong();
        if((l1>l2 && r1>r2 && l1<=r2) || (l1<l2 &&r1<r2 && r1>=l2)){
            System.out.println(Math.max(l1,l2)+" "+Math.min(r2,r1));
        }else if((l1<l2 && r1>r2)){
            System.out.println(l2+" "+r2);
        }else if(l1>l2 && r1<r2){
            System.out.println(l1+" "+r1);
        }
        else if(l1==l2){
            System.out.println(l1 +" "+Math.min(r1,r2));
        }else if(r1==r2){
            System.out.println(Math.max(l1,l2)+" "+r1);
        }else{
            System.out.println(-1);
        }
        sc.close();
    }
}