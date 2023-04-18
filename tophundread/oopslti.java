package tophundread;


class employee{
    int id ;
    String name ;
    int salary ;
    employee(int id, String name, int salary){
        this.salary = salary;
        this.name = name;
        this.id = id;
    }
    public void fun1(){
        System.out.println("salary bonus of "+name+" "+(salary/100)*20);
    }
}
public class oopslti {
    public static void main(String[] args) {
        employee emp = new employee(10003,"aka",40000);
        employee emp1 = new employee(10004,"aka",80000);
       
        emp.fun1();
        emp1.fun1();
    }
    
}
