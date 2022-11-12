import java.util.*;
/**
 * U_Float_or_int
 */
public class U_Float_or_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean dotFound = false;
        for(int i=0;i<s.length();i++){
            char x= s.charAt(i);
            if(x=='.'){
                dotFound=true;
                if(Integer.parseInt(s.substring(i+1))==0){
                    System.out.println("int "+s.substring(0,i));
                }else{
                    System.out.println("float "+s.substring(0,i)+" 0."+s.substring(i+1));
                }
            }
        }
        if(!dotFound){
            System.out.println("int "+s);
        }
        sc.close();
    }
}