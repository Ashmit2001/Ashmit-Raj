package tophundread;

import java.util.*;
public class dltatind {

	public static void main(String[] args) {
		// your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int arr[] = new int[n]; 
		for(int i =0; i<n; i++){
          arr[i] = sc.nextInt();
		}
		System.out.println("Enter the location where you wish to delete an element");
        int ei = sc.nextInt();
		if( ei > arr.length){
            System.out.println("Invalid Inpurt");
        }
        for(int i =0; i<n; i++){
			
              if(i == ei){
				  arr[i] = arr[i+1];
                  for(int j = i; j<arr.length-1; j++){
                    arr[j] = arr[j+1];
                  }
                  
			  
              break;	
                }
					}
                    
					
                    for(int i =0; i<arr.length-1; i++){
                        System.out.println(arr[i]);
                    }
                }
            }