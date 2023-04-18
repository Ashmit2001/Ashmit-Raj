package tophundread;
import java.util.*;
public class sumdowhile {
    public static void main(String[] arr){
		Scanner sc = new Scanner(System.in);
	//	int n2 = -999;
		int n ;
		int sum = 0;
		;
		do{
			n = sc.nextInt();
			if(n!=-999){
			sum += n;
			}
			
		}while(n != -999);
            
		System.out.println("The sum is "+sum);
		       

	}

}

