import java.util.*;
public class C_Wonderful_Number{
    public static String getBin(long n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            long digit = n %2;
            sb.append(digit);
            n=n/2;
        }
        return sb.toString();
    }
    public static boolean isPalindrome(String bin){
        int n = bin.length();
        for(int i=0,j=n-1;i<n/2 && j>=0;i++,j--){
            if(bin.charAt(i)!=bin.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean isOdd = n%2!=0?true:false;
        if(isOdd){
            String bin = getBin(n);
            if(isPalindrome(bin)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}