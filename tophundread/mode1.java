package tophundread;
import java.util.*;
public class mode1 {
    
        
    
        
 
    public static void main(String[] args) {
		// fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the end string");
		String str2 = sc.nextLine();
        boolean str3 = str.endsWith(str2);
        if(str3){
			System.out.println("\""+str+"\""+" starts with \""+str2+"\"");
		}else{
			System.out.println("\""+str+"\""+" does not start with \""+str2+"\"");
		}
	}
}

	}
}