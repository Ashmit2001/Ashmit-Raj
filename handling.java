public class handling {
    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }
    public static void method1(){
        method2();
        System.out.println("method1 ended");
    }
    public static void method2(){
        try{
        String str = null;
        str.length();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
