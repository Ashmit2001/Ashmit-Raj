package tophundread.newoops;


import java.util.HashSet;
import java.util.Set;

public class removedublicateinshorted {
    public static void main(String arrgs[]){
       int arr[] = {0,0,1,1,2,2,2,3,3};
       int n = arr.length;
       Set<Integer> st = new HashSet<>();
        st = fun1(arr , n);
        for(Integer s:st){
            System.out.print(s +" ");
    }
}
      public static Set<Integer> fun1(int arr[] , int n ){
    
    
        Set<Integer> set = new HashSet<>();
       for(int i =0; i<n; i++){
        set.add(arr[i]);
        
    
       }
       return set;

       }
    
}
