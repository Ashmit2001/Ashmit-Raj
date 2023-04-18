package tophundread.newoops;

public class testemployee {
    public static void main (String arrgs[]){
        employee amit;
        amit = new employee(100889 , "amit" , 88880.0);
       // amit.takeinput(10005,"amit",989898.8);
       amit.setSallary(amit.getSallary()+1000000);
        amit.output();
        amit.setCity("hydrabad");
        
        //amit.name = "sumit";
        //amit.id = 1000002;
        //amit.sallary = 8338399.7;
         employee sumit = new employee(100067 ,  "sumit", 78988.0);
         
        // sumit.name = "sumit";
        // sumit.id = 1000002;
        // sumit.sallary = 8338399.7;
       // sumit.takeinput(100067,"sumit", 6788888.9);
       sumit.output();
        // System.out.println(amit.name);
        // System.out.println(amit.id);
         //System.out.println(sumit.sallary);
         //System.out.println(sumit.name);
         //System.out.println(sumit.id);
         //System.out.println(sumit.sallary);
    
        
    }
    
}
