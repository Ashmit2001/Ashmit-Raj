import java.util.Scanner;
public class oneDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of a array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the element");
        for(int i=0; i<n; i++)
             arr[i] = sc.nextInt();
        
        System.out.print("\nelements : \n");
            for(int i=0; i<n; i++){
                System.out.print(arr[i] +" ");
            }
        }
    }
    

