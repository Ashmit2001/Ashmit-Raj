import java.util.*;
import java.util.TreeSet;
class Expense implements Comparable<Expense>{
	 private String expenseCategory ;
	 private int amount;
	 public Expense(String expenseCategory , int amount){
		 this.expenseCategory = expenseCategory;
		 this.amount = amount;

	 }
	 public void setExpenseCategory(String expenseCategory){
   this.expenseCategory = expenseCategory;
	 }
	  public void setAmount(int amount){
   this.amount = amount;
	 }
	 public String getExpenseCategory(){
		 return expenseCategory;
	 }
	 public int getAmount(){
		 return amount;
        }
        @Override
        public int compareTo(Expense expense) {
            // Sort expenses in descending order of amount
            return expense.getAmount() - this.amount;
        }
        
   }
   public class kk {
   
       public static void main(String[] args) {
           // your code here
       Scanner sc = new Scanner(System.in);
       TreeSet<Expense> expenses = new TreeSet<Expense>();
   
       while(true){
           System.out.println("Enter expense category");
            String rent = sc.nextLine();
            System.out.println("Enter expense amount");
            int expense = sc.nextInt();
            
            Expense ex = new Expense(rent,expense);
            expenses.add(ex);
            System.out.println("Do you want to continue(yes/no):");
            String want = sc.nextLine();
            if(want.equals("no")){
                break;
            }
       }
         System.out.println("Top spending categories");
         System.out.println(String.format("%-15s%-15s","Category", "Amount"));
         int totalAmount = 0;
         for(Expense expense : expenses.descendingSet()){
            System.out.println(String.format("%-15s%-15d", expense.getExpenseCategory(), expense.getAmount()));
            totalAmount += expense.getAmount();
         }
         System.out.println("Total amount spent: " + totalAmount);
       }
   
   }
   
