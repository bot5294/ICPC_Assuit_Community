import java.util.*;
public class J_Count_Letters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        TreeMap<String,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            String c = s.charAt(i)+"";
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        // Set<String> keys = map.keySet();
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        // for(String key:keys){
        //     System.out.println(key+" : "+map.get(key));
        // }
        sc.close(); 
    }
}