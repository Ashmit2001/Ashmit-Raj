import java.util.HashMap;
import java.util.Map;
//import java.util.Arrays;

public class hashelementsinarray {
    public static void main( String arrgs[]){
        
        int arr[] = new int[]{5,8,5,7,8,10};

        int n = arr.length;

        countfreq(arr , n);
    }

    public static void countfreq(int[] arr, int n ) {
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        for(int i =0; i<n; i++){
            int key = arr[i];
            if(map.containsKey(arr[i]))
            map.put(arr[i], map.get(arr[i] +1));
            else
            map.put(arr[i],1);
        }
        for (Map.Entry < Integer, Integer > itr: map.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
    
}
