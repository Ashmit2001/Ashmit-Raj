
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class firstnonrepeatbyhash {
    public static void main(String arr[]){
        String str = "AABCDDDCCCE";
        Map<Character, Integer> m = new HashMap<>();

        for(int i =0; i<str.length(); i++){
        
              if(m.containsKey(str.charAt(i))){
                m.put(str.charAt(i), m.get(str.charAt(i)) +1);
              }
               else{
                    m.put(str.charAt(i),1);
               }
        }
              System.out.println(m);
              for(Entry<Character , Integer> entrySet : m.entrySet()){
              if(entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
               // break;
              }
            }
    }
    
}
