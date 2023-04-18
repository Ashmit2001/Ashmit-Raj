public class removedubbyarr {
    public static void main(String arr[]){
        String name = "aannnsssshhh";
        //StringBuilder sb = new StringBuilder();
        
        char[] ch = name.toCharArray();
        int j =0;
        for(int i =0; i<ch.length; i++){
             if(ch[i]!= ch[j]){
                  j++;
                  ch[i] = ch[j];
             }
             
        } 
           System.out.println(new String(ch));
           
    }
}

