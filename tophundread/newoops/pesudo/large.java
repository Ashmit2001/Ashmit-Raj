package tophundread.newoops.pesudo;

public class large{
    public static void main(String[] args) {
        int arr[] = {12,45,67,89,1};
        System.out.println(fun1(arr));

    }
      public static int fun1(int arr[]){
      // int largest = 0;
      int small = arr[0];
        for(int i = 1; i<arr.length; i++){
           //  if(arr[i]>largest){
            if(arr[i]<small){
                small = arr[i];
             }
        }
           return small;
      }
}
