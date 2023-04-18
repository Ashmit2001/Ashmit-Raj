package tophundread;

import java.util.*;
class strlti {
    
        public static void main(String[] args)  {
            // fill your code here
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String str2 = sc.nextLine();
            boolean str3 = str.equals(str2);
            boolean str4 = str.equalsIgnoreCase(str2);
            String str5 = str.replace(" ","" );
            String str6 = str2.replace(" ", "");
            boolean str7 = str5.equalsIgnoreCase(str6);
          

            if(str3 ){
                System.out.println("RED");
            }
            else if(str4 ){
                 System.out.println("BLUE");
            }else if(str7) {
                System.out.println("YELLOW");
            } else if(str3 == false && str3 == false && str7 == false) {
                System.out.println("GREEN");
        }
    }
}
        