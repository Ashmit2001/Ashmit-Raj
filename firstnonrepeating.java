import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class firstnonrepeating {
    public static void main(String arrgs[]){
        String str = "prepinsta";
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i =0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),str.charAt(i)+1);

            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(Entry<Character,Integer> entrySet : map.entrySet()){
        if(entrySet.getValue() == 1){

            System.out.println(entrySet.getKey());
            break;
        }
    }
    }
    
}
