package tophundread;

public class removevowel {
    public static void main (String arrgs[]){
        String str = "anshi";
        int n = str.length();

       // boolean flag = true;
        for(int i =0; i<n; i++){
            if(str.charAt(i)=='a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                 continue;
            
        }else{
            System.out.print(str.charAt(i));
        }
           
           }
        }
    }
    

