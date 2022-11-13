import java.util.*;
public class H_One_Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("NO");
            sc.close();
            return;
        }

        boolean isOdd = false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("NO");
                isOdd=true;
                break;
            }
        }
        if(!isOdd)
            System.out.println("YES");
        sc.close();
    }
}