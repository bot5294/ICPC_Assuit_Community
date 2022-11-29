import java.util.*;
public class R_String_Score{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = sc.next().toCharArray();
        ArrayList<Character> sb = new ArrayList<>();
        for(char c:arr)
            sb.add(c);

        int score=0;
        for(int i=0;i<sb.size();i++){
        switch(sb.get(i)){
            case 'V':
            score+=5;
            break;
            case 'W':
            score+=2;
            break;
            case 'X':
            if(i+1<sb.size())
            sb.set(i+1,'A');
            break;
            case 'Y':
            if(i+1<sb.size()){
            sb.add(sb.get(i+1));
            sb.set(i+1,'A');
            }
            break;
            case 'Z':
            if(i+1<sb.size()){
                char x = sb.get(i+1);
                if(x=='V'){
                    score/=5;
                }else if(x=='W'){
                    score/=2;
                }
                // if(i+2<sb.length()){
                if(x=='W'||x=='V'){
                    sb.set(i+1,'A');
                }
            // }
            }
            break;
        }
        }
        System.out.print(score);
        sc.close();
    }
}

//  play tricky. marks it something else when remove.