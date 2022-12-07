import java.util.*;
public class O_Five_in_One{
    public static boolean isPrime(long n){
        if(n==1)
            return false;
        for(long i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int a){
        String s = a+"";
        StringBuilder sb = new StringBuilder(a+"");
        StringBuilder rsb = new StringBuilder(sb.reverse());
        if(rsb.toString().equals(s)){
            return true;
        }
        return false;
    }
    public static void fiveInOne(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int np=0;
        int npal=0;
        int max_nd=0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(isPrime(arr[i])){
                np++;
            }
            if(isPalindrome(arr[i])){
                npal++;
            }
            int d=arr[i];
            int count=1;
            for(int j=2;j<d;j++){
                if(d%j==0){
                    count++;
                }
            }
            if(maxCount<count){
                max_nd=arr[i];
                maxCount=count;
            }else if(maxCount==count){
                if(max_nd<arr[i]){
                    max_nd=arr[i];
                }
            }
        }
        System.out.println("The maximum number : "+max);
        System.out.println("The minimum number : "+min);
        System.out.println("The number of prime numbers : "+np);
        System.out.println("The number of palindrome numbers : "+npal);
        System.out.println("The number that has the maximum number of divisors : "+max_nd);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fiveInOne(arr);
        sc.close();
    }
}