import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashdsa {
    public static void main(String arrgs[]){
        HashMap<Integer , String> map = new HashMap<>();
        
        map.put(1 , "aman");
        map.put(2 , "man");
        map.put(3 , "kul");
        map.put(4 , "tuk");

        System.out.println(map);
        System.out.println(map.size());

        for(Map.Entry<Integer , String> x : map.entrySet())
        System.out.println(x.getKey() +" "+x.getValue());

        if(map.containsKey(1))
        System.out.println("contains key"+ map.get(1));

        else
           System.out.println("doesn't");
    }
    
}
