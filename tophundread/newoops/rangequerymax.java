package tophundread.newoops;

public class rangequerymax {
public static void main(String[] args) {
    int arr[] = {90,23,45,67,100,89,78,200,45};
    int prefixmax[] = new int[arr.length];
    int n = prefixmax.length;
    int a[] = fun1(arr , prefixmax , n);
    for(int e : a){
        System.out.print(e+" ");
}
}
   public static int[] fun1(int arr[] , int prefixmax[] , int n){
    prefixmax[0] = arr[0];
    for(int i = 1; i<n; i++){
        prefixmax[i] = Math.max(prefixmax[i-1], arr[i]);

    }
      return prefixmax;
    
    }
}
    

