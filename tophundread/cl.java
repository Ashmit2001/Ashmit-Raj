package tophundread;
import java.util.*;
class customer {
    String street;
    String city;
    int pincode;
    String country;
    //customer(String street , String city,int pincode,String country){
          //  this.street = street;
            //this.city = city;
            //this.pincode = pincode;
            //this.country = country;
    //}
     void display(){
       System.out.println("Street: "+street);
        System.out.println("City: "+city);
        System.out.println("Pincode: "+pincode);
        System.out.println("Country: "+country);
    }
    
}
public class cl{

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        String street = sc.nextLine();
        System.out.println("Enter the city");
        String city = sc.nextLine();
        System.out.println("Enter the pincode");
        int pincode = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the country");
        String country = sc.nextLine();

        customer c = new customer();
        c.city = city;
        c.street = street;
        c.pincode = pincode;
        c.country = country;
        c.display();
}
}