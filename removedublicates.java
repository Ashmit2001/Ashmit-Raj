public class removedublicates {
     public static void main(String []args){
        String str = "Annsshhhh";
         char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
         for(int i = 0; i<arr.length; i++){
            boolean flag = false;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
                
            }
            if(!flag){
                sb.append(arr[i]);
            }
            
        }
        System.out.println(sb);
            
        
        
      
        
     

	}
}
