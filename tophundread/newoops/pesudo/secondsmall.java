package tophundread.newoops.pesudo;

public class secondsmall {
    public static void main(String[] args) {
    int arr[] = {34,23,45,78}; 
    int small = arr[0];
    int secondsmall = Integer.MAX_VALUE;  
     for(int i = 0; i<arr.length; i++){
        if(arr[i]<small){
            secondsmall = small;
            small = arr[i];
        }else if(arr[i]!=small){
            if(arr[i]<secondsmall){
                secondsmall = arr[i];
            }
        }
     }
      System.out.println(secondsmall);
    }
    
}
