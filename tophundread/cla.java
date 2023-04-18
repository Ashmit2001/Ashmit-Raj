package tophundread;
import java.util.*;
class Country{
    //Fill code here
    String name;
    String countryCode;
    String isdCode;
    Country(String name ,String countryCode,String  isdCode){
        this.name = name;
        this.countryCode = countryCode;
        this.isdCode = isdCode;
    }
            
void display() {
System.out.println("Country Name : "+name);
System.out.println("Country Code : "+countryCode);
System.out.println("ISD Code : "+isdCode);
//Fill code here
}
}
public class cla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the country name");
          String n = sc.nextLine();
          System.out.println("Enter the country code");
          String c = sc.nextLine();
          System.out.println("Enter the isd code");
          String ic = sc.nextLine();
          Country d = new Country(n,c,ic);
          d.display();
        
    }
}
