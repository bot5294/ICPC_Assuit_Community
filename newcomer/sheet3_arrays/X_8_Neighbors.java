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
        boolean hasEightN = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==r && j==c){
                    if(i-1>=0 && j-1>=0)
                    if(arr[i-1][j-1]!='x'){
                        hasEightN=false;
                        break;
                    }
                    if(i-1>=0)
                    if(arr[i-1][j]!='x'){
                        hasEightN=false;
                        break;
                    }
                    if(i-1>=0 && j+1<m)
                    if(arr[i-1][j+1]!='x'){
                        hasEightN=false;
                        break;
                    }
                    if(j-1>=0)
                    if(arr[i][j-1]!='x'){
                        hasEightN=false;
                        break;
                    }
                    if(j+1<m)
                    if(arr[i][j+1]!='x'){
                        hasEightN=false;
                        break;
                    }
                    if(j-1>=0 && i+1<n)
                    if(arr[i+1][j-1]!='x'){
                        hasEightN=false;
                        break;
                    }
                    if(i+1<n)
                    if(arr[i+1][j]!='x'){
                        hasEightN=false;
                        break;
                    }
                    if(i+1<n && j+1<m)
                    if(arr[i+1][j+1]!='x'){
                        hasEightN=false;
                        break;
                    }
                }
            }
        }
        System.out.println(hasEightN==true?"yes":"no");
        sc.close();
    }
}