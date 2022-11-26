import java.util.*;
public class H_Good_or_Bad{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(s.contains("010")||s.contains("101")){
                System.out.println("Good");
            }else{
                System.out.println("Bad");
            }
            t--;
        }
        sc.close();
    }
}