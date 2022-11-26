import java.util.*;
public class X_8_Neighbors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char arr[][] = new char[n][m];
        for(int i=0;i<n;i++){
            String s= sc.next();
            for(int j=0;j<m;j++){
                arr[i][j]=s.charAt(j); 
            }
        }
        int r = sc.nextInt()-1;
        int c =sc.nextInt()-1;
        int ix[] = {-1,-1,-1,0,0,1,1,1};
        int iy[] = {-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<8;i++){
            int x = r+ix[i];
            int y = c+iy[i]; 
            if(x>=0 && x<n && y>=0 && y<m)
            {
            if(arr[x][y]!='x'){
                System.out.println("no");
                sc.close();
                return;
            }
        }
        }
        System.out.println("yes");
        sc.close();
    }
}