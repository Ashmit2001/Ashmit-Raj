public class introstring {
    public static void main(String args[]){
        String name = "amit";
        //String name2 = new String( "amit");
        String name2 = new String( "amit").intern();
        String name3 = "amit";
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name == name3);
        System.out.println(name.length());
        char w[] = name3.toCharArray();
        System.out.println(name.indexOf("m"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.contains("a"));
        String msg = "hello how are you";
        String e[] = msg.split(" ");
        for(String  t : e){
           System.out.println(t);
        }
           System.out.println(name.substring(1));
           System.out.println(name.substring(1, 2));
           System.out.println("amit@gmail.com".startsWith("amit"));
           System.out.println("amit123".endsWith("123"));
           System.out.println("ram".compareToIgnoreCase("Ram"));
           System.out.println("ram".equalsIgnoreCase("Ram"));
           System.out.println("amit".charAt(1));
    }

    
    
}
