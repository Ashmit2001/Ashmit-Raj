
    import java.io.*;
import java.util.*;

public class university {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of colleges");
		int numColleges= sc.nextInt();
		sc.nextLine();
		LinkedHashSet<String> collegeSet = new LinkedHashSet<String>();
		//Fill your code
		System.out.println("Enter the college details one by one");
		for(int i =0; i<numColleges; i++){
			 String collegeDetails = sc.nextLine();
            collegeSet.add(collegeDetails);
		}
		System.out.println("Enter number of colleges to be displayed");
		int numToDisplay = sc.nextInt();
        sc.nextLine();
        if(numToDisplay>numColleges){
			System.out.println("Invalid");
            return;
		}
            System.out.println("First "+numToDisplay+" college details");
		    int count = 0;
            for(String collegeDetails : collegeSet){
                System.out.println(collegeSet);
                count++;
                if(count>numToDisplay)
                break;
            }
               System.out.println("Enter the collage code to search :");
               String searchCode = sc.nextLine();
               boolean found = false;
               for(String collegeDetails :collegeSet){
                String[] parts = collegeDetails.split("-");
                 if(parts[0].equals(searchCode)){
                    System.out.println("Entered college code is found");
                found = true;
                break;
                 }
               }
            
               if (!found) {
                System.out.println("Entered college code is not found");
            }
		}
}

    

