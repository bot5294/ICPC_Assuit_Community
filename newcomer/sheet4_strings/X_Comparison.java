import java.util.*;
public class X_Comparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if(n==1){
            System.out.println(s);
            sc.close();
            return;
        }
        ArrayDeque<String> st = new ArrayDeque<>();
        for(int i=1;i<n;i++){
            char s1[] = s.substring(0, i).toCharArray();
            char s2[] = s.substring(i).toCharArray();
            // System.out.println(new String(s1)+" : "+new String(s2)+" line 11");
            Arrays.sort(s1);
            Arrays.sort(s2);
            st.add(new String(s1)+new String(s2));
        }
        String ans=st.pop();
        while(!st.isEmpty()){
            String temp = st.pop();
            if(ans.compareTo(temp)>0){
                ans=temp;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}