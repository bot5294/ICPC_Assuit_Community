import java.util.*;
public class N_Check_Code{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        int n = a+b+1;
        if(s.charAt(a)=='-'){
            for(int i=0;i<a;i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){}else{
                    System.out.print("No");
                    sc.close();
                    return;
                }
            }
            for(int i=a+1;i<n;i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){}else{
                    System.out.print("No");
                    sc.close();
                    return;
                }      
            }
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        sc.close();
    }
}