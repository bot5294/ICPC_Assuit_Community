import java.util.*;
public class M_Subsequence_String{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char arr[] ={'h','e','l','l','o'};
        int k=0;
        for(int i=0;i<n;i++){
            char x = s.charAt(i);
            if(k<5 && x==arr[k])
            if(arr[k]=='h'){
                arr[k]='1';
                k++;
            }else if(x=='e'){
                arr[k]='2';
                k++;
            }else if(x=='l'){
                arr[k]='3';
                k++;
            }else if(x=='o'){
                arr[k]='5';
                k++;
            }
        }
        s = String.valueOf(arr);
        if(s.equals("12335")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}