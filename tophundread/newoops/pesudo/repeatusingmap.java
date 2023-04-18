package tophundread.newoops.pesudo;


import java.util.HashMap;
import java.util.Map;

public class repeatusingmap {
    public static void main(String[] args) {
        
    
    int arr[] = {1,2,3,4,1,2};
    Map<Integer,Integer> map = new HashMap<>();
         for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
         }
         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
         //repeating --> if(entry.getvalue()>1);
            //non-repeating
            if(entry.getValue()<2){
                System.out.println(entry.getKey());
              }
         }
    
  
    
}
}

