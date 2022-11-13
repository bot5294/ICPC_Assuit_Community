import java.util.*;
public class R_Sequence_of_Numbers_and_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n<=0 || m<=0){
                sc.close();
                return;
            }
            int max = Math.max(n,m);
            int min = Math.min(n,m);
            int sum = 0;
            for(int i=min;i<=max;i++){
                System.out.print(i+" ");
                sum+=i;
            }
            System.out.println("sum ="+sum);
        }
        sc.close();
    }
}