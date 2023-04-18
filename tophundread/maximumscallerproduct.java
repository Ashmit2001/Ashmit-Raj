package tophundread;

import java.util.Arrays;

public class maximumscallerproduct {
    public static void main(String arr[]){
        Integer arr1[] = {2,4,3};
        Integer arr2[] = {4,6,2};
        

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int product = 0;
        for(int i =0; i<arr1.length; i++){
            product += arr1[i]*arr2[i];

        }
           System.out.print(product);
    }
    
}
