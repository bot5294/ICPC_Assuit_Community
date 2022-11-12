import java.util.*;
public class F_Multiplication_table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<13;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        sc.close();
    }
}