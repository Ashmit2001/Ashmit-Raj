import java.util.*;
import java.util.HashSet;
public class setq {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println("Enter the username");
        String name = sc.nextLine();
        set.add(name);
        System.out.println("Do you want to continue? (Y/N)");
        String want = sc.nextLine();
        if(want.equalsIgnoreCase("n")){
            break;
        }
        }
        //System.out.println(set);
        System.out.println("The unique number of usernames is "+set.size());

    }
    
}
