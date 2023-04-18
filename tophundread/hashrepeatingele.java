package tophundread;


import java.util.HashMap;
import java.util.Map.Entry;

public class hashrepeatingele {
    public static void main(String arrgs[]){
        int arr[] = {10,20,40,30,10,20};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);

            }
        }
           for(Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>1){
                    System.out.print(entry.getKey()+" ");
                }
           }
    }
    
}
