package tophundread.newoops.pesudo;

public class selectionsort{
    public static void main(String[] args) {
        int arr[] = {10 , 5 , 8 ,20 , 2 ,18};
        int n = arr.length;

    }
       public static int[] fun1(int arr[] , int n){
           for(int i =0; i<n; i++){
                  int temp[i] ;
                  for(int j =0; int j<n-1; j++){
                    if(arr[j]<arr[j+1])
                      temp[i] = arr[j+1];
                      arr[i+1] = arr[i];
                      arr[i] = temp[i];
                  }  
       }
}
}