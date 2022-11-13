import java.util.*;
public class M_Lucky_Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean isPrinted = false;
        for(int i=a;i<=b;i++){
            if(i/10==0 && i==4||i==7){
                System.out.print(i+" ");
                isPrinted=true;
                continue;
            }
            int x=i;
            boolean isValid = true;
            while(x>0){
                int d = x%10;
                if(d!=4 && d!=7){
                    isValid=false;
                    break;
                }
                x=x/10;
            }
            if(isValid){
                System.out.print(i+" ");
                isPrinted=true;
            }
        }
        if(!isPrinted){
            System.out.println(-1);
        }
        sc.close();
    }
}