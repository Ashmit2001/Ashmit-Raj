package tophundread.newoops;

public class rangequerysum {
public static void main(String[] args) {
    int arr[] = {10,20,30,40,50};
    int prefixsum[] = new int[arr.length];
        prefixsum[0] = arr[0]; 
        for(int i = 1; i<prefixsum.length; i++ ){
             prefixsum[i] = prefixsum[i-1] + arr[i];
        }
        for(int e : prefixsum){
            System.out.print(e+" ");
        }
        System.out.println();
        int lower = 1;
        int upper = 3;
        if(lower == 0){
            System.out.println(prefixsum[upper]);
        }else{
        System.out.println(prefixsum[upper]- prefixsum[lower-1]);
}
    
}
}
