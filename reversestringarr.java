public class reversestringarr {

        public static void main(String []args){
           String str = "annnnnnnnnshhhhhhh";
           StringBuilder sb = new StringBuilder();
           char[] c = str.toCharArray();
           for(int i =0; i<c.length; i++){
               boolean is = true;
               for(int j =i+1; j<c.length; j++){
                   if(c[i]== c[j]){
                       is = false;
                       break;
                   }
               }
                 if(is==true){
                     sb.append(c[i]);
                 }
           }
              System.out.println(sb);
        }
   }
    

