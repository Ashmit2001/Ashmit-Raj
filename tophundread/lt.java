package tophundread;
import java.util.*;
public class lt {
    public static void main(String[] args) {
		// your code here
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number of elements in the array");
   int n = sc.nextInt();
  
   int arr[] = new int[n];
   System.out.println("Enter the elements in the array");
   for(int i =0; i<n; i++){
	 arr[i] = sc.nextInt();

   }
         int sum = 0;
         float result = 0;
         for(int i =0; i<arr.length; i++){
           sum +=arr[i];
         }
             result = sum/n;
             System.out.printf("The median of the array  is :%2f",result);
             System.out.println();
	}

}

    

