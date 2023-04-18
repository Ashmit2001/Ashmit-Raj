package tophundread.newoops;

public class zigzag {
public static void main(String arrgs[]){

    int arr[] = {1,2,3,4,5};
    int[] ar = fun1(arr);
    for(int e : ar){
        System.out.print(e+" ");
    }
}
public static int[] fun1(int arr[]){
    for(int i = 0; i<arr.length-1; i+=2){
         int t  = arr[i];
         arr[i] = arr[i+1];
         arr[i+1] = t;
         
    }
    return arr;    
        }
        
    
}

