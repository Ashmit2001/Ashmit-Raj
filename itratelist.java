import java.util.LinkedList;
import java.util.ListIterator;
public class itratelist {
    public static void main(String[] args) {
        var list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(null);
        list.add(40);
        list.add(50);
        list.add(60);
        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            if(itr.next() == null){
                itr.remove();
            }
        }
        System.out.println(list);
    }
    
}
