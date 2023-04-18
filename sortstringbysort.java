
import java.util.Arrays;

public class sortstringbysort {
    public static void main(String args[]){
        String name = "name";
        StringBuilder sb = new StringBuilder();
        char[] arr = name.toCharArray();
        Arrays.sort(arr);
        sb.append(arr);
        System.out.println(sb);
    }
    
}
