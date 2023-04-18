package tophundread;

class Road_toll{
    String vechile_type ;
    int tire;

Road_toll(String vechile_type,int tire){
    this.vechile_type = vechile_type;
    this.tire = tire;
}

    public int fun1(){
        int result ;
        if(tire ==2){
            result = 0;
        }else if(tire == 4){
            result = 10;
        } else if(tire>4){
            result = 20;
        } else{
            result = -1;
        }
        return result;
    }
}

public class toll {
    public static void main(String[] args) {
        Road_toll r1 = new Road_toll("bike", 2);
        Road_toll r2 = new Road_toll("truck", 8);
        System.out.println(r1.fun1());
        System.out.println(r2.fun1());
    }
    
}


