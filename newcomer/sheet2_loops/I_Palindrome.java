import java.util.*;
public class I_Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oval=n;
        int base=10;
        int p=0;
        boolean isFirstDigitFound = false;
        while(n>0){
            int d = n%10;
            if(d>0) isFirstDigitFound=true;
            // System.out.println(p);
            if(!isFirstDigitFound && d==0){ n=n/10; continue;}
            p = d+p*base;
            n=n/10;
        }
        System.out.println(p);
        if(p==oval){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}