// sum of n odd numbers n^2
//  sum of n even numbers  n(n+1)
//  sum of n natural numbers  n(n-1)/2

import java.util.*;
public class C_Sum_of_Range{
    public static long sumN(long n){
        return (n*(n+1));
    }
    public static long sumEven(long l,long r){
        return sumN(r/2)-sumN((l-1)/2); // passing after divding by 2 beacuse we have 1/2 numbers as even
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(b<a){
            long t = b;
            b=a;
            a=t;
        }
        long d = b-a+1;
        long s = (d*(d-1))/2;
        long sum=0;
        sum = s+(a*d);
        long esum = sumEven(a,b);
        long osum=sum-esum;
        System.out.println(sum);
        System.out.println(esum);
        System.out.println(osum);
        sc.close();
    }
}