package tophundread;

import java.util.HashSet;
import java.util.Set;

public class setsubarrayinsubset {
    public static void main(String arr[]){
        int arr1[] = {1,2,3,5,7};
        int arr2[] = {1,9};
        int m = arr.length;
        int n = arr.length;
        if(fun1(arr1 , arr2 ,m ,n)==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
       public static boolean fun1(int arr1[] , int arr2[], int m , int n){
           Set<Integer> set = new HashSet<>();

           for(int i =0; i<m; i++){
            if(!set.contains(arr1[i]))
               set.add(arr1[i]);
           }
             for(int i =0; i<n; i++){
                if(!set.contains(arr2[i])){
                    return false;
                }
                
             }
            return true;
       }
    
}
