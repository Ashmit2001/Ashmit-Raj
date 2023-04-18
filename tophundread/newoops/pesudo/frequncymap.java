package tophundread.newoops.pesudo;

import java.util.HashMap;
import java.util.Map;

public class frequncymap {
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,4,4,3};
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }

        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    
}
