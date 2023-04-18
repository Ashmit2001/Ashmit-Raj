import java.util.HashMap;
import java.util.*;
public class hashmore {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            map.put(key,value);
        }
            name.fun1(map);
    }

    class name {
        public static void fun1(HashMap<Integer,Integer> map){
          // boolean flag = true;
            for(int key : map.keySet() ){
                if(map.get(key) > 75){
                   System.out.println(key);
                }
            }
            
        }
    }
}
    

