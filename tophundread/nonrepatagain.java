package tophundread;

import java.util.Arrays;

public class nonrepatagain {
    public static void main(String[] args) {
        String str = "aaaa";
        char[] arr = str.toCharArray();
          Arrays.sort(arr);    
          System.out.println(arr);
          for(int i =0; i<arr.length; i++){
            if(arr[i]!=arr[i+1]){
                System.out.println(i);
                break;
            }else{
                System.out.println("-1");
            }
          }
          
    }
}
