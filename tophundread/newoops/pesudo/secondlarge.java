package tophundread.newoops.pesudo;

public class secondlarge {
    public static void main(String[] args) {
        int arr[] = {23,78,98,56};
        int max = 0;
        int second = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                second = max ;
                max = arr[i];
            }if(arr[i] != max){
                if(arr[i]>second){
                    second = arr[i];
                }
            }
        }
         System.out.println(second);
    }
    
}
