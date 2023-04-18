public class alphabet {
    public static void main(String arr[]){
        String str = "456a76S5U@@#i$%";
        String name = str.replaceAll("[^a-zA-z]", "");
        System.out.println(name);
    }
    
}
