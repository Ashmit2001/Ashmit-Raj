package tophundread;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequencyarray {
    public static void main(String arrgs[]){
        int[] arr = {10,20,10,30,20};
            Map<Integer, Integer> h = new HashMap<>();
            for(int i =0; i<arr.length; i++){
                if(h.containsKey(arr[i])){
                    h.put(arr[i], h.get(arr[i]) +1);
                }else{
                    h.put(arr[i],1);
                }
            }
                for(Entry<Integer,Integer> entry :  h.entrySet()){
                    System.out.println(entry.getKey() +" "+ entry.getValue());
                }

                }
            }
    
            
    

