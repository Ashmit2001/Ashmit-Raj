package tophundread;

import java.util.HashSet;
import java.util.Set;

public class removedublicates {
    public static void main(String arrgs[]){
        int arr [] = {1,1,1};
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<n; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    
}
