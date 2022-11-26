import java.util.*;
public class G_Conversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for(int i=0;i<n;i++){
            char x = sb.charAt(i);
            if(x==','){
                sb.replace(0,n,sb.substring(0, i)+" "+sb.substring(i+1));
            }else{
                int xi = (int) x;
                if(xi>=65 && xi<90){
                    sb.replace(0,n,sb.substring(0, i)+((x+"").toLowerCase())+sb.substring(i+1));
                }else{
                    sb.replace(0,n,sb.substring(0, i)+((x+"").toUpperCase())+sb.substring(i+1));
                }
            }
        }
        System.out.println(sb);
        sc.close();
    }
}