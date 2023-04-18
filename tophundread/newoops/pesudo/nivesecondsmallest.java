package tophundread.newoops.pesudo;

public class nivesecondsmallest {
    public static void main(String[] args) {
        int arr[] = {12,11,3,4};
        int res = -1;
            int small = 0;
        for(int i = 0; i<arr.length; i++){
             
            if(arr[i]<small){
                res = small;
                small = arr[i]; 
            } 
            if(arr[i]!= small){
                if(arr[i] < res){
                    res = i;

                }

            }
        }
            System.out.println(res);
        }
    }


