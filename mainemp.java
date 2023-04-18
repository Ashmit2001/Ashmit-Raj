import java.util.ArrayList;
import java.util.Collections;

//import java.util.List;

import java.util.Scanner;

public class mainemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<empdetails> li = new ArrayList<empdetails>();
       while(true){
        System.out.println("enter name");
        String name = sc.nextLine(); 
        System.out.println("enter salary");
        int salary = sc.nextInt(); 
        System.out.println("enter id");
        int id = sc.nextInt();
        sc.nextLine(); 
        li.add(new empdetails(name, salary, id));
        
       System.out.println("want to continue y/n");
       String want = sc.nextLine();
       if(want.equalsIgnoreCase("n")){
        break;
       }
       }
       System.out.println(li);
       ArrayList<empdetails> k = new ArrayList<>(li);
     Collections.sort(k);
     System.out.println(k);
        sc.close();
    }
    
}
