import java.io.*;
import java.lang.*;
import java.util.*;
public class tt{
    public static void main(String[]args) throws Exception
    {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of objects:");
     int n = sc.nextInt();
    System.out.println("Enter the Total no of tickets:");
    int totalnooftickets = sc.nextInt();
    Ticket.setTotalnooftickets(totalnooftickets);
    for(int i =0; i<n; i++){
          System.out.println("Enter the ticketid:");
          int ticketid = sc.nextInt();
          System.out.println("Enter the price:");
          int price = sc.nextInt();
          System.out.println("Enter the no of tickets:");
          int nooftickets = sc.nextInt();
          Ticket ticket = new Ticket();
          ticket.setTicketid(ticketid);
          ticket.setPrice(price);
          int totalAmount = ticket.Calculatetotalamount(nooftickets);
          if(totalAmount>0){
              System.out.println("Total no of ticket after booking:"+Ticket.getTotalnooftickets());
          }
        }
    }
}
 class Ticket {
   private int ticketid;
   private int price;
private static int totalnooftickets;


 public  void setTicketid(int ticketid){
         this.ticketid = ticketid;
   }
   public int getTicketid(){
       return ticketid;
   }
   public int getPrice(){
       return price;
   }
   public void setPrice(int price){
       this.price = price;
   }
   public static int getTotalnooftickets(){
       return totalnooftickets;
   }
   public static void setTotalnooftickets(int totalnooftickets){
       Ticket.totalnooftickets = totalnooftickets;
    }
    public int Calculatetotalamount(int nooftickets){
      
        if(totalnooftickets<nooftickets){
            System.out.println("Sorry tickets not available.");
            return 0;
        }else{
            totalnooftickets -= nooftickets;
            int totalAmount = nooftickets*price;
            System.out.println("Total no of tickets: "+totalnooftickets);
            System.out.println("Total amount:"+totalAmount);
        
            return totalAmount;
        }
    }
            
       }