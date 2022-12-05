import java.util.*;
public class S_Max_Split{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int cl=0;
        int cr=0;
        int count=0;
        ArrayDeque<String> st = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                cl++;
                sb.append("L");
            }else{
                cr++;
                sb.append("R");
            }
            if(cl==cr){
                st.push(sb.toString());
                sb.setLength(0);
                count++;
            }
        }
        System.out.println(count);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        sc.close();
    }
}