package tophundread.newoops;

public class rotatearray {
        public static void reverse(int arr[] , int i , int j ){
            while(i<j){ 
            int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
            }
        }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int k = 2;
        k = k%arr.length;
        if(k<0){
            k = arr.length + k;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
