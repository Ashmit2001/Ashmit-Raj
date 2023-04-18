import java.util.*;
public class replacesybstring {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String : "); 
       String s1 = sc.nextLine();
       System.out.print("Enter the String to be replaced : ");
       String oldString = sc.nextLine();
       System.out.print("Enter the new String : ");
       String newString =sc.nextLine();
     
       String replace = s1.replace(oldString,newString);
       System.out.println(replace);
    }
    
}
