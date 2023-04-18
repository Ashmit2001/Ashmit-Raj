public class studentde implements Comparable<studentde>{
    private String student_name;
    private int amount ;
    studentde(String student_name , int amount){
          this.student_name = student_name;
          this.amount = amount;
    }
    public String getStudent_name() {
        return student_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String toString(){
        return student_name +" "+amount;
    }
    @Override
    public int compareTo(studentde that) {
        return Integer.compare(this.amount,that.amount);
       
    }
    
}
