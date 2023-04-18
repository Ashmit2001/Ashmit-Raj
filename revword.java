public class revword {
    public static void main(String[] args) {
        String name = "ansh raj";
        String[] words = name.split(" ");
        String output = " ";
       
        for(int j = words.length-1; j>=0; j--){
            String reverseword = "";
            for(int i = word.length()-1; i>=0; i--){
                 reverseword +=word.charAt(i);
            }
                  output += reverseword +" ";
         } 
           System.out.println(output);
    }
}
