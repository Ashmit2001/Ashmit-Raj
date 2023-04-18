
class obj{
     String name = "aman";
    public  void fun1(){
    System.out.println(name +"kya haal");
}
}
class obj2 extends obj{
     public  void fun1(){
    System.out.println(name+"kya haal");
}
}
public class checkmain {
    public static void main(String[] args) {
		obj2 o = new obj2();
		o.fun1();
	}
}
