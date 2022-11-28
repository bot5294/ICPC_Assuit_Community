import java.util.*;
public class Q_Reverse_Words{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(String e:s){
            for(int i=e.length()-1;i>=0;i--){
                sb.append((e.charAt(i)));
            }
            sb.append(" ");
        }
        System.out.print(sb.substring(0,sb.length()-1));
        sc.close();
    }
}