import java.util.*;
public class B_Let_s_use_Getline{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='\\')
                break;
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}