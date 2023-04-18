public class reversewordinscne {
    
    public static void main(String arr[]){
        String str = "I am a boy ";
        String[] word = str.split(" ");
        for(int i = word.length -1; i>=0; i--){
               System.out.print(word[i] +" "); 
        }
        System.out.println();
    }
    
}
