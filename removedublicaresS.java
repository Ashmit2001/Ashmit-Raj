public class removedublicaresS {
    public static void main(String arr[]){
        String name = "muunnnuuu";
         
        StringBuilder sc = new StringBuilder();
        for(int i =0; i<name.length(); i++){ 
        char ch = name.charAt(i);
        int index = name.indexOf(ch , i+1);
        if(index == -1){
           sc.append(ch);   
        }
        }
         System.out.println(sc);
          }
    }
    

