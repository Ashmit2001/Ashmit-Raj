public class threesum{

    public static void main(String []args){
       int a = 2 , b = 3 , c = 4;
       
       int result =0;
       if(a>b){
           if(b>c){
               result = a;
           }
              else{
                   result = c;
               
               }    
       }
           
        else{
           if(b>c){
           result = b;
       }
           else{
              result = c; 
           } 
       }
         System.out.println(result);
    }
}
