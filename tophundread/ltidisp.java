package tophundread;
import java.util.*;

 class ItemType {
	private String  name;
	private double costPerDay;
	private double deposit;
	public ItemType(String  name,double costPerDay,double deposit){
		this.name = name;
		this.costPerDay = costPerDay;
		this.deposit = deposit;
	}
	public String getName() {
         return name;
     }
     public void setName(String name) { 
        this.name = name; 
     } 
     public double getCostPerDay() {
         return costPerDay;
     }
     public void setCostPerDay(double costPerDay) { 
    this.costPerDay = costPerDay; 
   } 
    public double getDeposit() {
         return deposit;
    }
    public void setDeposit(double deposit) { 
        this.deposit = deposit; 
}

}    
	class Display{
		//Fill your code		
	
	public void display(ItemType it){
      System.out.println("Item type details");
	  System.out.println(String.format("Name : "+"%.1f",it.getName()));
	  System.out.println(String.format("CostPerDay : "+"%.1f",it.getCostPerDay()));
	  System.out.println(String.format("Deposit : "+"%.1f",it.getDeposit()));
		//Fill your code		
	}
}
	
public class ltidisp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the item type name");
String n = sc.nextLine();
System.out.println("Enter the cost per day");
double c = Double.parseDouble(sc.nextLine())  ;
System.out.println("Enter the deposit");
double d = Double.parseDouble(sc.nextLine()) ;
ItemType item = new ItemType(n,c,d);
Display dis = new Display();
dis.display(item);
		//Fill your code		

	}
}

 

