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
        int r = sc.nextInt();
        int c =sc.nextInt();
        boolean hasEightN = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==r && j==c){
                    if((i-1>=0 && i+1<n)&&(j-1>=0 && j+1<m)){
                        int x = i-1;
                        int y = j-1;
                        for(;x<i+1;x++){
                            for(;y<j+1;y++){
                                if(arr[x][y]!='x')
                                    hasEightN=false;
                            }
                        
                        }
                    }
                }
            }
        }
        if(!((r-1>=0 && r+1<n) && (c-1>=0&&c+1<m)))
            hasEightN=false;
        System.out.println(hasEightN==true?"yes":"no");
        sc.close();
    }
}