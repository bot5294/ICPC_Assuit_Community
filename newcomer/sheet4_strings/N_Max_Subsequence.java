import java.util.*;
public class N_Max_Subsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s[] = sc.next().toCharArray();
        int count=1;
        int type=1;
        int min=1;
        char x=s[0];
        for(int i=1;i<n;i++){
            if(x!=s[i]){
                type++;
            }else{
                count++;
            }
            if(min>count)
                min=count;
            x=s[i];
        }
        System.out.println(type==n?type:min*type);
        sc.close();
    }
}