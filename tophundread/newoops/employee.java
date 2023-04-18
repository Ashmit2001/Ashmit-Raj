package tophundread.newoops;

public class employee {
    private int id ;
    private String name;
   private double sallary;
   private  String companyname ;
   private  int  phonenumber;
   private  String city;
   private  String email;
   private  String manager ;
   private  String department;
   private  int  pincode;
  
   employee(){
    System.out.println("default cons call");
     id = 0; 
     name = "" ;
     sallary = 0;
     companyname = "Brain Mentors";
     
   }
   employee(int id , String name , double sallary  ){
    this();
    this.id = id + companyname.length();
    this.name = name;
    this.sallary = sallary ;
   
   }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSallary() {
    return this.sallary;
  }

  public void setSallary(double sallary) {
    this.sallary = sallary;
  }

  public String getCompanyname() {
    return this.companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }

  public int getPhonenumber() {
    return this.phonenumber;
  }

  public void setPhonenumber(int phonenumber) {
    this.phonenumber = phonenumber;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getManager() {
    return this.manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getPincode() {
    return this.pincode;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }
    



 //public void takeinput(int id ,String name , double sallary){
    
      

     // this.id = id;
      //this.name = "amit";
      //this.sallary = 122398.88;
      
  
    public void output(){
        System.out.println("id"+" "+id);
        System.out.println("name"+" "+name);
        System.out.println("sallary"+" "+sallary);
        System.out.println("company name"+companyname);
        System.out.println("city"+" "+amit.getSallary());
        System.out.println("*************************");
       
    }


}



