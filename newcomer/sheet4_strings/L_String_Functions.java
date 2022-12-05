import java.util.*;
public class L_String_Functions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s=sc.next();
        StringBuilder sb = new StringBuilder(s);
        int l=0;
        int r=0;
        int swap=0;
        while(q-- >0){
            String x=sc.next();
            switch(x){
                case "pop_back":
                    sb.deleteCharAt(sb.length()-1);
                    break;
                case "front":
                    System.out.println(sb.charAt(0));
                    break;
                case "back":
                    System.out.println(sb.charAt(sb.length()-1));
                    break;
                case "sort":
                    l = sc.nextInt();
                    r = sc.nextInt();
                    if(l>r){
                        swap =l;
                        l=r;
                        r=swap;
                    }
                    String t1 = sb.substring(l-1,r);
                    char[] arr = t1.toCharArray();
                    Arrays.sort(arr);
                    sb.replace(l-1, r, String.valueOf(arr));
                    break;
                case "reverse":
                    l = sc.nextInt();
                    r = sc.nextInt();
                    if(l>r){
                        swap =l;
                        l=r;
                        r=swap;
                    }
                    StringBuffer sb2 = new StringBuffer(sb.subSequence(l-1, r));
                    String t2 = sb2.reverse().toString();
                    sb.replace(l-1, r, t2);
                    break;
                case "print":
                    int pos = sc.nextInt();
                    System.out.println(sb.charAt(pos-1));
                    break;
                case "substr":
                    l = sc.nextInt();
                    r = sc.nextInt();
                    if(l>r){
                        swap =l;
                        l=r;
                        r=swap;
                    }
                    System.out.println(sb.substring(l-1,r));
                    break;
                case "push_back":
                    char e = sc.next().charAt(0);
                    sb.append(e);
                    break;
            }
        }
        sc.close();
    }
}