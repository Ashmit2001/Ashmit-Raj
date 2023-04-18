package tophundread;
import java.util.*;
public class dish {

	
	public static void main(String[] args) {
		// your code here
       Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int arr[] = new int[n];
	   for(int i = 0; i<arr.length; i++){
		   arr[i]= sc.nextInt();

	   }
	       int count = 0;
	       for(int i = 0; i<arr.length; i++){
			   boolean flag = true;
			    for(int j = i+1; j<arr.length; j++){
					if(arr[i]==arr[j]){
				    flag = false;
					 

					}
				}
				  if(flag  ){
                     count++;
				  }
				  
		   }
           System.out.println(count);
	}

}