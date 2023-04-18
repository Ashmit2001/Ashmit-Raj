package tophundread;

public class palindromename {
    public static void main(String arrgs[]){
        String str = "mam";
        String result = "";
        for(int i =str.length()-1; i>=0; i--){
           result = result + str.charAt(i);
           
        }
        System.out.print(result+" ");
        if(str.equals(result)){
              System.out.print("palindrome");
        }else{
            System.out.print("not palindrome");
        }
       

        }
    }
    

