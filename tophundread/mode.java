package tophundread;
import java.util.*;

public class mode {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
  
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();

    }
    HashMap<Integer, Integer> result = new HashMap<>();
    for(int i = 0;i<arr.length; i++){
         if(result.containsKey(arr[i])){
            result.put(arr[i],result.get(arr[i])+1);
         }   else{
            result.put(arr[i], 1);
         }
    }
      for(Map.Entry<Integer , Integer> i = result.entrySet()){

      }

}

}
