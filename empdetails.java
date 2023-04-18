public class empdetails implements Comparable<empdetails>{
   private String name;
    private int salary;
    private int id ;
    public empdetails(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 
    public String toString(){
        return name+" "+salary+" "+id;
    }
    @Override
    public int compareTo(empdetails that) {
       return Integer.compare(this.salary, that.salary);
       
    }
    
}
