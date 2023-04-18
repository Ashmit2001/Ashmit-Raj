package tophundread.newoops.pesudo;

import java.util.Arrays;

public class distinct {
    public static void main(String[] args) {
        int arr[] = {1,2,1,5,4,5,3,7};
        Arrays.sort(arr);
        int count = 1;
        for(int i =0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
