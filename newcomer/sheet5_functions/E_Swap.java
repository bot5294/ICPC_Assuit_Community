import java.util.*;
public class E_Swap{
    public static void swap(int x,int y){
        System.out.println(y+" "+x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        swap(x,y);
        sc.close();
    }
}