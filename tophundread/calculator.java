package tophundread;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first value :");
    int a = sc.nextInt();
    System.out.println("Enter the second value :");
int b = sc.nextInt();
System.out.println("Enter the choice from the menu");
int c = sc.nextInt();
switch(c){
    case 1: 
    System.out.println("The value after Addition is "+(a+b));
    break;
    case 2:
    System.out.println("The value after Subtraction is "+(a-b));
    break;
    case 3:
    System.out.println("The value after Multiplication is "+(a*b));
    break;
    case 4:
    float f = (float)a/b;
    System.out.println("The value after Addition is "+f);
    break;
    default:
    System.out.println("error");
}
    // Fill your code here

}
    
}
