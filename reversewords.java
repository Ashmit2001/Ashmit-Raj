public class reversewords {
    public static void main(String arr[]){
        String str = "I am a";

              String output = " ";

        String[] words = str.split(" ");
             for(String word :words ){
                   String reverse ="";
                  for(int i = word.length()-1; i>=0; i--){
                        reverse += word.charAt(i); 
                  }
                     output += reverse +" ";
             }   
                System.out.println(output);     
    }

    
}
