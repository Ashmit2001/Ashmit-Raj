package tophundread;

public class subsetsubarray {
    public static void main(String arr[]){
        int arr1[] = {1,4,3,7,8};
        int arr2[] = {1,3};
        int m = arr1.length;
        int n = arr2.length;
        
        for(int i =0; i<n; i++){
              boolean flag = true;
              for(int j =0; j<m; j++){
                if(arr2[i] == arr1[j]){
                   flag = true;
                   break;
              }
            }
              if(flag){
                System.out.println("yes");
              }else{
                System.out.println("false");
              }
        }
             
    }
    
}
