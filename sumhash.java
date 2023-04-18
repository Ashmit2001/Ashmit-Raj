import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class sumhash {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i =0; i<n; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            map.put(key,value);
         }
         int sumofeven = name.getSumOfEven(map);
         System.out.println(sumofeven);
    }
}
    class name {
        public static int getSumOfEven(Map<Integer, Integer> map){
             int sum =0;
             for(int key : map.keySet()){
                if(key%2 ==0){
                    sum += map.get(key);
                }
             }
             return sum;
        }
    }
    

