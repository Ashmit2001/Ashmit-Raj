import java.util.*;
    public class cusadd{
        //Fill code here	
        String street;
        String city;
        int pincode;
        String country;
        double food;	
void displayAddress() {
    //Fill code here
    System.out.println("Street: "+street);
    System.out.println("City: "+city);
    System.out.println("Pincode: "+pincode);
    System.out.println("Country: "+country);
}
    } 
    class ma{

   public static void main(String arr[]){
         Scanner sc = new Scanner(System.in);
         cusadd c = new cusadd();
         c.street = sc.nextLine();
         c.city = sc.nextLine();
         c.pincode = Integer.parseInt(sc.nextLine());
         
         c.country = sc.nextLine();
         c.food = sc.nextDouble();
         c.displayAddress();
         sc.close();

   } 
}

