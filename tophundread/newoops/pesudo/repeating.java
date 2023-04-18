package tophundread.newoops.pesudo;

public class repeating {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,4,4};
        for(int i = 0; i<arr.length; i++){
            boolean flag = false;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                }
            }
            if(flag==true){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
