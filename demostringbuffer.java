public class demostringbuffer {
    public static void main(String arrgs[]){
        String name = "amit";
        StringBuffer sb = new StringBuffer("amit");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("jfhfhfhfhffffffffffffffffffffh");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.insert(1, "s");
        System.out.println(sb.length());
        sb.reverse();
        sb.delete(1, 3);
        sb.deleteCharAt(1);
        
    }
    
}
