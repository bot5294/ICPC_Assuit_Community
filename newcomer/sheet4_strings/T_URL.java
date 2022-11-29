import java.util.*;
public class T_URL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = s.indexOf("?");
        s=s.substring(index+1);
        String srr[] = s.split("=");
        System.out.print(srr[0]);
        for(int i=1;i<srr.length-1;i++){
            String t[] = srr[i].split("&");
            System.out.println(": "+t[0]);
            System.out.print(t[1]);
        }
        System.out.println(": "+srr[srr.length-1]);
        sc.close();
    }
}