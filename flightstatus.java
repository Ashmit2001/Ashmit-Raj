import java.io.ObjectInputFilter.Status;
import java.util.*;
import java.util.ArrayList;
public class flightstatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var list = new ArrayList<String>();
        while(true){
        System.out.println("1.Schedule Flight");
        System.out.println("2.change status");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        int n = sc.nextInt();
        sc.nextLine();
        if(n == 4){
            System.out.println("You are logged-out");
            break;
        }
        int i = 1;
        if(n == 1){
        while(true){
        
            System.out.println("Enter the flights details "+i);
            System.out.println("Enter the flight name:");
            String name = sc.nextLine();
            list.add(name);
            System.out.println("Enter the flight number:");
            String number = sc.nextLine();
            list.add(number);
            System.out.println("Enter the Status:");
            String status = sc.nextLine();
            list.add(status);
            System.out.println("Do you want to add more flight(Yes/No):");
            String want = sc.nextLine();
            if(want.equalsIgnoreCase("no")){
                break;
            }
        }
    }
      else if(n == 2){
        while(true){
            System.out.println("Enter the flight number:");
             i = sc.nextInt();
             sc.nextLine();
            System.out.println("Enter the new status:");
            String status = sc.nextLine(); 
            list.set(i, status);
            System.out.println("Do you want to change status(Yes/No):");
            String want = sc.nextLine();
            if(want.equalsIgnoreCase("no")){
                break;
            }
        }
      }
      else if(n == 3){
        while(i !=0){
        System.out.println(list.get(status));
      }
    }
}
}