import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class mainstu {
    public static void main(String[] args) {
        List<studentde> stu = List.of(new studentde("ansh", 100),new studentde("krish", 10),new studentde("tish", 200));
       // System.out.println(stu);
            ArrayList<studentde> s = new ArrayList<>(stu);
           Collections.sort(s);
           System.out.println(s);
        }
    }
    

