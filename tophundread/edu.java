package tophundread;
import java.util.*;
public class edu {
    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name of the event");
            String str = sc.nextLine();
            System.out.println("Enter the type of the event");
            String str1 = sc.nextLine();
            System.out.println("Is it a paid entry? (Type Y or N)");
            String str2 = sc.nextLine();
            System.out.println("Enter the number of people expected");
            int m = sc.nextInt();
            System.out.println("Enter the projected expenses (in lakhs) for this event");
            double n = sc.nextDouble();
            System.out.println("Event Name :"+" "+str);
            System.out.println("Event Type :"+" "+str1);
            System.out.println("Expected Count :"+" "+m);
             System.out.println("Paid Entry :"+" "+str2);
             System.out.println("Projected Expense :"+" "+n);
                // Fill your code here
        }
        
     }
    
}
