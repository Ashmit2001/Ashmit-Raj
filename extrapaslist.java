import java.util.*;
import java.util.LinkedList;
public class extrapaslist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var list = new LinkedList<String>();
        
        System.out.println("Enter the number of passengers Booked");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the passenger's name who Booked");
        for(int i =0; i<n; i++){
            String name = sc.nextLine();
            list.add(name);
        }
         System.out.println("Enter the number of seats available");
         int n2 = sc.nextInt();
         sc.nextLine();
            System.out.println("Extra Passengers list");
            System.out.println(list.subList(n2, n));
        
           }
    }
    

