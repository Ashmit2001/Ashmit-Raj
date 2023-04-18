package tophundread.newoops.pesudo;

public class sort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,5};
        for(int i = 0; i<arr.length-1; i++){
            //int temp = 0;
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
       for(int a : arr){
        System.out.print(a+" ");
       }
System.out.println();
        }
        
    }
    

