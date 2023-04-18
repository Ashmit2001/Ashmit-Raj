public class replace {
    public static void main(String arr[]){
        String name = "@#$%ashm&*it";

        String name1 = name.replaceAll("[^a-zA-Z0-9]", "");
    
      System.out.println(name1);
    }
    
}
