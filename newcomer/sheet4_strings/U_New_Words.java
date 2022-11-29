import java.util.*;
public class U_New_Words{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int arr[] = new int[27];
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            arr[x-'a']++;
        }
        int ve = arr['e'-'a'];
        int vg = arr['g'-'a'];
        int vy = arr['y'-'a'];
        int vp = arr['p'-'a'];
        int vt = arr['t'-'a'];
        System.out.println(Math.min(ve,Math.min(vg,Math.min(vy,Math.min(vp,vt)))));
        sc.close();
    }
}