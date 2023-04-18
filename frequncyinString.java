
import java.util.HashMap;
import java.util.Map.Entry;

public class frequncyinString {
    public static void main(String arrgs[]){
        String str = "prepinstttsa";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put( str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
         for(Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
         }
    }
}
