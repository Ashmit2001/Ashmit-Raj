package tophundread.newoops;

import java.util.ArrayList;

import java.util.Collections;

public class leaders {
    public static void main(String arrgs[]){
        int arr[] = {20 , 31 , 5, 1, 2};
        int n = arr.length;
       System.out.println( leader(arr,n));
    }
      public static ArrayList<Integer> leader(int arr[] ,int n  ){
        int max = -1;   
        ArrayList<Integer> list = new ArrayList<>();
           for(int i =n-1; i>=0; i--){
            if(arr[i]>max){
                max= arr[i];
                list.add(max);
                
            }
           }
           Collections.reverse(list);
            return list;
      }
    
}

