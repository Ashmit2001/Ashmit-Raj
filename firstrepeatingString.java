public class firstrepeatingString {
    public static void main(String arr[]){
        String  str = "AASSSSCDDIIA";
        
        for(int i =0; i<str.length(); i++){
            boolean istrue = true;
            for(int j = 0; j<str.length(); j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                     istrue = false;
                     
                }
            }
                if(istrue){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
    

