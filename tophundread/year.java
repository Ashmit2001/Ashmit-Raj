package tophundread;
import java.util.*;
public class year {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = sc.nextInt();
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        String name = ""; ;
        int days = 0;;
        switch(month){
            case 1:
             name = "january"; 
             days = 31;
             break;
                case 2:
                name = "February"; 
             if(((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0))){
                 days = 29;
             }else{
                days = 28;
             }
                
             //days = 31;
             break;
                case 3:
             name = "march"; 
             days = 31;
             break;
                case 4:
             name = "April"; 
             days = 30;
             break;
                case 5:
             name = "May"; 
             days = 31;
             break;
                case 6:
             name = "June"; 
             days = 30;
             break;
               case 7:
             name = "July"; 
             days = 31;
             break;  
                case 8:
             name = "August"; 
             days = 31;
             break;        
                case 9:
             name = "September"; 
             days = 30;
             break;      
                case 10:
             name = "October"; 
             days = 31;
             break; 
                case 11:
             name = "November"; 
             days = 30;
             break;   
                case 12:
             name = "December"; 
             days = 31;
             break;    
             default:
             System.out.println("error");                                                                                                                                                                                                                                                                
        }
        System.out.println(name+" of "+year+" has "+days+" days.");
            // Fill your code here
        
     }
}

