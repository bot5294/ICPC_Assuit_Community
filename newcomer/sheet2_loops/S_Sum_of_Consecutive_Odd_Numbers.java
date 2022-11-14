import java.util.*;
public class S_Sum_of_Consecutive_Odd_Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int min = Math.min(x,y)+1;
            int max = Math.max(x,y);
            if(min%2==0){
                min++;
            }
            int sum=0;
            for(int i=min;i<max;i+=2){
                sum+=i;
            }
            System.out.println(sum);
            n--;
        }
        sc.close();
    }
}