package tophundread.newoops;

public class finddublicate {
public static void main(String arrgs[]){
    int arr[] = {1,3,4,2,2};
    int n = arr.length; 
    System.out.println(fun1(arr , n));
}
    public static int fun1(int arr[] , int n){
        for(int i = 0; i<n; i++){
         boolean flag = false;
          for(int j = i+1; j<n; j++){
            if(arr[i]==arr[j]){
                flag = true;
                break;
            }
          }
          if(flag){
            return arr[i];
          }
        }
        return -1;
        
    }
}
