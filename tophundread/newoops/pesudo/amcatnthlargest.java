package tophundread.newoops.pesudo;

import java.util.Arrays;

public class amcatnthlargest {
    public static void main(String[] args) {
        int arr [] = {11,-1,-4,12,-6};
        int n = 3;
        Arrays.sort(arr);
        for(int i =0; i<=arr.length; i++){
            if(i == n-1){
                System.out.println(arr[i]);
            }
        }
    }
    
}
