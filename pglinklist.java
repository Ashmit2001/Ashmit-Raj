import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class pglinklist {
	
	public static void main(String args[])throws Exception{
        LinkedList<String> participants = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of participants to be registered : ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume the new line character

        System.out.println("Enter the participants details");
        for (int i = 0; i < count; i++) {
            String participant = scanner.nextLine();
            String[] details = participant.split("_");

            if (details.length == 3 && details[1].matches("^(IT|CSE|ECE)$") && details[2].matches("^\\d{7}$")) {
                participants.add(participant);
            }
        }
        System.out.println("List of valid participants");
        if(participants.isEmpty()){
            System.out.println("No valid participants");
        }else{
            for(String a : participants){
            System.out.println(a);
        }
	}


		//Fill your code
		
	}
}
