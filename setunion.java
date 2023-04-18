import java.util.*;
import java.util.HashSet;
public class setunion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values in list 1");
        int n = sc.nextInt();
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        System.out.println("Enter the values");
        
        for(int i =0; i<n; i++){
            int  val = sc.nextInt(); 
            set1.add(val);
        } 
        System.out.println("Enter the number of values in list 2");
        int n2 = sc.nextInt();
        System.out.println("Enter the values");
        for(int i =0; i<n2; i++){
            int  val2 = sc.nextInt(); 
            set1.add(val2);
        } 
        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);

        System.out.println("Set 1");
       for(int i : set1){
        System.out.println(i+" ");
       }

        System.out.println("Set 2");
        for(int i : set2){
            System.out.println(i+" ");
           }

       
        System.out.println("Union");
        for(int i : union){
            System.out.println(i+" ");
        }
        }
        
    }
    

