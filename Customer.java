import java.util.*;
public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String  getCustomerName(){
        return customerName;
    }
    public void setCustomerEmail(String  customerEmail){
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail(){
            return  customerEmail;
    }
    public void setCustomerType(String  customerType){
        this.customerType = customerType;
    }
    public String getCustomerType(){
            return  customerType;
        }
        public void setCustomerLocation(String  customerLocation){
            this.customerLocation = customerLocation;
        }
        public String getCustomerLocation(){
                return  customerLocation;
        }
        void displayAddress(){
            System.out.println("Customer Details");
            System.out.println("Name: "+getCustomerName());
            System.out.println("E-mail: "+getCustomerEmail());
            System.out.println("Type: "+getCustomerType());
            System.out.println("Location: "+getCustomerLocation());
        }
    }
       
    class m {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Customer c = new Customer();
            System.out.println("Enter the Customer Details");
            System.out.println("Enter the name");
            c.setCustomerName(sc.nextLine());
            System.out.println("Enter the email");
            c.setCustomerEmail(sc.nextLine());
            System.out.println("Enter the type");
            c.setCustomerType(sc.nextLine());
            System.out.println("Enter the location");
            c.setCustomerLocation(sc.nextLine());
            c.displayAddress();
           
            sc.close();
            
        }
    }

