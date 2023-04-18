package tophundread;


    import java.util.HashMap;
import java.util.Map.Entry;

public class nonrepe {
    public static void main(String[] args) {
        String str = "examly";
     HashMap<Character,Integer> map = new HashMap();
        
        for(int i =0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
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
    

