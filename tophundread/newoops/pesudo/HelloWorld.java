package tophundread.newoops.pesudo;

class HelloWorld {
    public static void main(String[] args) {
    int a = 15;
    int b = 25;
    
    int i ;
    for( i = a; i<=b; i++){
        boolean flag = true;
        for(int j = 2; j<i; j++){
            if(i%j == 0){
                flag = false;
                break;
            }
        }
        
    
    if(flag==true){
        System.out.print(i+" ");
    }
     
     }
    }
}