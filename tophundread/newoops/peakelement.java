package tophundread.newoops;

public class peakelement {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int peak = 0;
        if(arr.length == 1){
            System.out.println(arr[0]);
             return;
        }
        for(int i =0; i<arr.length; i++){
            if(i==0){
            if(arr[i+1]<arr[i]){
               peak = arr[i+1];
            }
        }else if(i == arr.length-1){ 
              if(arr[i-1]<arr[i]){
               peak = arr[i];
        }
    }    else{
              if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                peak = arr[i];
              }
    }
           

    }
    System.out.println(peak);
    
}
}
