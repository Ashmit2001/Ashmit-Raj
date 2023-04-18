import java.util.HashMap;

public class twosumhash {
    public static void main(String arrgs[]){
        int arr [] = {1,3,2,5,7};
        int sum = 6;
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i =0; i<arr.length; i++){
        int key = sum - arr[i];
        if(map.get(arr[i])==null){
            map.put(key , i);
        }else{
            System.out.println(map.get(arr[i]) +" "+i);
        }
    }
    
}
}
