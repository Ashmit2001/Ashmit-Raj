
import java.util.LinkedHashSet;
import java.util.Set;

public class removedublicatebyset {
    public static void main(String arr[]){
        //String name = "aaasssshhhhh";
        StringBuilder sb = new StringBuilder();
        Set<Character> s = new LinkedHashSet<>();
        String name = "aaasssshhhhh";
        for(int i = 0; i<name.length(); i++){
             s.add(name.charAt(i));
        }
          for(Character e : s){
             sb.append(e);
          }
            System.out.println(sb);
    }
    
}
