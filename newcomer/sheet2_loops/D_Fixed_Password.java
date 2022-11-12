import java.util.*;
public class D_Fixed_Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==1999){
                System.out.println("Correct");
                sc.close();
                return;
            }else{
                System.out.println("Wrong");
            }
        }
        sc.close();
    }
}