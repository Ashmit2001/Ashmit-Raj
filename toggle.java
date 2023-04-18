import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        for(int i = 0; i<=str.length()-1; i++){
            if(Character.isUpperCase(str.charAt(i))){
            s = s+Character.toLowerCase(str.charAt(i));
        }else{
            s = s+Character.toUpperCase(str.charAt(i));
        }
    }
           System.out.println(s);
           
           sc.close();
    
}
}