package tophundread.newoops.pesudo;

import java.util.Arrays;

public class sorthalf {
    public static void main(String[] args) {
        int arr[] = {5,3,1,6,7,8};
        Arrays.sort(arr);
        for(int i = arr.length-2; i>=arr.length/2; i--){
           
            if(arr[i]<arr[i+1]){
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
    
}
