package tophundread.newoops;

import java.util.Arrays;

public class secondlargestbysort {
    public static void main(String arrgs[]){
        int arr[] = {10,20,10,890,890};
        int n = arr.length;
        Arrays.sort(arr);
        int result = n-1;
        for(int i = n-1; i>=0; i--){
          if(arr[i]!=arr[i-1]){
            //result = arr[i];
          }
          System.out.println();
        }
        
        }
    }
    

