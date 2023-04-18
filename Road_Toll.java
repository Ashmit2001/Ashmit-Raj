public class Road_Toll {
    
        String type_Of_Vechile;
        int number_Of_Tyres;

        Road_Toll(String type_Of_Vechile,int number_Of_Tyres){
            this.type_Of_Vechile = type_Of_Vechile;
            this.number_Of_Tyres = number_Of_Tyres;
        }
        public  void tax(){
            if(number_Of_Tyres==2){
                System.out.println("bike free");
            }else if(number_Of_Tyres==4){
                System.out.println("Amount is 10-car");
            }else{
                System.out.println("Amount is 20-bus/truck");
            }
        }
        
    }
    
    
    class HelloWorld {
        public static void main(String[] args) {
          Road_Toll car = new Road_Toll("car",4);
           Road_Toll bike = new Road_Toll("bike",2);
            Road_Toll truck = new Road_Toll("truck",8);
            car.tax();
            bike.tax();
            truck.tax();
          
        }
    }

