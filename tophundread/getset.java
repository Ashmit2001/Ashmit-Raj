package tophundread;
import java.util.*;
class Player{
    private String name;
    private Integer age;
    private String country;

    public Player(String name,Integer age,String country){
          this.name = name;
          this.age = age ;
          this.country = country;
    }
    public void setName(String name){
        this.name = name;
       }
       public String getName(){
        return this.name;
       }
       public void setAge(int age){
        this.age = age;
       }
       public int getAge(){
        return this.age;
       }
       public void setCountry(String country){
        this.country = country;
       }
       public String getCountry(){
        return this.country;
       }
       
    
}
class fun{
public void display(Player player){
    System.out.println("Player Details:");
    System.out.println("Name:"+player.getName());
    System.out.println("Age:"+player.getAge());
    System.out.println("Country:"+player.getCountry());
   }
}
public class getset {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Name:");
       String name = sc.nextLine();
       System.out.println("Enter Age:");
       int age = Integer.parseInt(sc.nextLine());
       System.out.println("Enter Country:");
       String country = sc.nextLine(); 
       Player p = new Player(name,age,country);
       fun f = new fun();
       f.display(p);
    }
}
