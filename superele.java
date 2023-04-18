//import java.util.*;
public class superele {
    public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);
     
      int arr[] = {7,9,5,2,8,7};
      int n = arr.length;
  
      System.out.println(fun1(arr,n));
      
    }
      public static  int fun1(int arr[] , int n ){
           
           int count = 0;
           for(int i =0; i<arr.length; i++){
            boolean flag = true;
              for(int j =i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    flag = false;
                    break;
                }
              }
              if(flag)
                count++;
              
           }
           
           return count; 
      }
    
    
}
