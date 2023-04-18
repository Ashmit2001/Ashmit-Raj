package tophundread.newoops;

public class missingnumxor {
    public static void main(String arrgs[]){
        int arr[] = {1,2,3,4,6};
        int xor = arr[0];
        for(int i = 1; i<arr.length; i++){
            xor ^= arr[i];
        }
        int xor2 = 1;
        for(int i =2; i<=arr.length+1; i++){
            xor2 ^= i;
        }
         System.out.println("the missing number is"+" " +(xor2^xor));
    }
    
}
