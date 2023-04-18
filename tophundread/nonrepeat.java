package tophundread;
import java.util.*;
public class nonrepeat {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    fun1(str);
   
    }
    public static void fun1(String str){   
    for( int i = 0; i<str.length()-1;i++){
        boolean flag = true;
        for(int j = i+1; j<str.length(); j++){
            if(str.charAt(i)==str.charAt(j)){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println(i);
            break;
        }else{
            System.out.println("-1");
        }
        }
        
    } 
     
    
   
    }
     
        

