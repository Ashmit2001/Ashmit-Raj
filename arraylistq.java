import java.util.*;
import java.util.ArrayList;
public class arraylistq {
	public static void main(String args[]) {
		//write your code here
		
		Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter the number of halls:");
		int n = sc.nextInt();
        sc.nextLine();
        
		for(int i =0; i<n; i++){
            System.out.println("Enter the Hall Name "+(i+1));
            String hall_name = sc.nextLine();
            list.add(hall_name);
		}
		System.out.println("Enter the hall name to be searched:");
		String searched = sc.nextLine();
		if(list.contains(searched)){
			System.out.println(searched+" hall is found in the list at position "+list.indexOf(searched));
		}else{
            System.out.println(searched+" hall is not found");
        }
        sc.close();
	}
}