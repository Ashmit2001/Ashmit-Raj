package tophundread;

import java.util.Arrays;
import java.util.Collections;



public class productoftwoarray {
    public static void main(String arrgs[]){
        Integer arr1[] = {1,2,6,3,7};
        Integer arr2[] = {10,7,45,3,7};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        int product = 0;

        for(int i =0; i<arr1.length; i++){
             product += arr1[i]*arr2[i];
        }
        System.out.println(product);
    }
    
}
