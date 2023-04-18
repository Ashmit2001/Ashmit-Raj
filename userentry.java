import java.util.*;
import java.util.LinkedList;
public class userentry {
    public static void main(String[] args) {
        var list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println("Enter Username");
        String name = sc.nextLine();
        list.add(name);
        System.out.println("Do you want to continue ?(yes/no)");
        String want = sc.nextLine();
        if(want.equalsIgnoreCase("no")){
            break;
        }
        }
        System.out.println("Number of Users = "+list.size());
    }
    
}
